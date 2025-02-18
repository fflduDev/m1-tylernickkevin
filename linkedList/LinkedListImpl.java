package linkedList;

public class LinkedListImpl implements LinkedList {
	private ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		ListItem current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		if (isItemInList(thisItem)) {
			return false;
		}
		ListItem newItem = new ListItem(thisItem);
		if (head == null) {
			head = newItem;
		} else {
			ListItem current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newItem;
		}
		return true;
	}

	@Override
	public Integer itemCount() {
		int count = 0;
		ListItem current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	@Override
	public void listItems() {
		ListItem current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		if (head == null) {
			return false;
		}
		if (head.data.equals(thisItem)) {
			head = head.next;
			return true;
		}
		ListItem current = head;
		while (current.next != null) {
			if (current.next.data.equals(thisItem)) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		if (head == null) {
			return false;
		}
		if (head.data.equals(itemToInsertBefore)) {
			ListItem newNode = new ListItem(newItem);
			newNode.next = head;
			head = newNode;
			return true;
		}
		ListItem current = head;
		while (current.next != null) {
			if (current.next.data.equals(itemToInsertBefore)) {
				ListItem newNode = new ListItem(newItem);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		ListItem current = head;
		while (current != null) {
			if (current.data.equals(itemToInsertAfter)) {
				ListItem newNode = new ListItem(newItem);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public void sort() {
		if (head == null || head.next == null) {
			return;
		}
		head = mergeSort(head);
	}

	private ListItem mergeSort(ListItem head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListItem middle = getMiddle(head);
		ListItem nextOfMiddle = middle.next;
		middle.next = null;
		ListItem left = mergeSort(head);
		ListItem right = mergeSort(nextOfMiddle);
		return sortedMerge(left, right);
	}

	private ListItem getMiddle(ListItem head) {
		if (head == null) {
			return head;
		}
		ListItem slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private ListItem sortedMerge(ListItem left, ListItem right) {
		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}
		ListItem result;
		if (left.data.compareTo(right.data) <= 0) {
			result = left;
			result.next = sortedMerge(left.next, right);
		} else {
			result = right;
			result.next = sortedMerge(left, right.next);
		}
		return result;
	}
}