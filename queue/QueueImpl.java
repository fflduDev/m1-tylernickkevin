package queue;

public class QueueImpl implements Queue {

	private Node front, rear;
	private int size, capacity;

	private class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public QueueImpl(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.front = this.rear = null;
	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enQueue(String element) {
		if (isFull()) {
			System.out.println("Queue is full, cannot enqueue: " + element);
			return;
		}
		Node newNode = new Node(element);
		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
		System.out.println("Enqueued: " + element);
	}

	@Override
	public String deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty, cannot dequeue.");
			return null;
		}
		String element = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		System.out.println("Dequeued: " + element);
		return element;
	}

	@Override
	public void display() {
		System.out.println("Queue elements:");
		Node current = front;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	@Override
	public String peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty, nothing to peek.");
			return null;
		}
		return front.data;
	}
}