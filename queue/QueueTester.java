package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue queue = new QueueImpl(5);

		// Enqueue items
		queue.enQueue("first item");
		queue.enQueue("second item");
		queue.enQueue("third item");

		// Display items
		queue.display();

		// Peek at the front item
		System.out.println("Peek: " + queue.peek());

		// Dequeue items
		queue.deQueue();
		queue.deQueue();

		// Display items again
		queue.display();

		// Check if the queue is empty
		System.out.println("Is queue empty? " + queue.isEmpty());
	}
}