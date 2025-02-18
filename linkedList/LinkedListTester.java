package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList tester = new LinkedListImpl();

		// Add items
		tester.addItem("first item");
		tester.addItem("second item");
		tester.addItem("third item");

		// List items
		tester.listItems();

		// Check item count
		System.out.println("Item count: " + tester.itemCount());

		// Check if an item is in the list
		System.out.println("Is 'second item' in list? " + tester.isItemInList("second item"));

		// Delete an item
		tester.deleteItem("second item");
		tester.listItems();

		// Insert before
		tester.insertBefore("new item", "third item");
		tester.listItems();

		// Insert after
		tester.insertAfter("another new item", "first item");
		tester.listItems();

		// Sort items
		tester.sort();
		tester.listItems();
	}
}