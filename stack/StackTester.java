package stack;

public class StackTester {
    public static void main(String[] args) {
        StackImpl stackTester = new StackImpl();

        System.out.println("Testing stack implementation...");

        // Push elements
        stackTester.push("Alice");
        stackTester.push("Bob");
        stackTester.push("Charlie");

        // Display stack
        stackTester.display();

        // Peek at the top element
        System.out.println("Top element: " + stackTester.peek());

        // Pop elements
        System.out.println("Popped: " + stackTester.pop());
        System.out.println("Popped: " + stackTester.pop());

        // Display stack after popping
        stackTester.display();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stackTester.isEmpty());

        // Add more elements to check stack capacity
        for (int i = 1; i <= 10; i++) {
            stackTester.push("Rider" + i);
        }

        // Try to push when full
        stackTester.push("Overflow Rider");

        // Display final stack
        stackTester.display();

        // Empty the stack completely
        while (!stackTester.isEmpty()) {
            System.out.println("Removing: " + stackTester.pop());
        }

        // Final check
        System.out.println("Is stack empty? " + stackTester.isEmpty());
    }
}
