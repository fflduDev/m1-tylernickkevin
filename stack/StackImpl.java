package stack;

public class StackImpl implements Stack {
    private String[] stackArray; // Array to store stack elements
    private int top; // Points to the top element
    private int capacity; // Max size of the stack

    // Constructor
    public StackImpl() {
        this.capacity = 10; // Default size
        this.stackArray = new String[capacity];
        this.top = -1; // Empty stack
    }

    // Set a custom capacity for the stack
    @Override
    public void setCapacity(int size) {
        this.capacity = size;
        this.stackArray = new String[capacity];
        this.top = -1; // Reset stack
    }

    // Push an element onto the stack
    @Override
    public void push(String s) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push: " + s);
            return;
        }
        stackArray[++top] = s; // Increment top and add element
        System.out.println("Pushed onto stack: " + s);
    }

    // Pop an element from the stack
    @Override
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        }
        return stackArray[top--]; // Return and decrement top
    }

    // Peek at the top element without removing it
    @Override
    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return null;
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    @Override
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    @Override
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // Return the current size of the stack
    @Override
    public int size() {
        return top + 1;
    }

    // Display the contents of the stack
    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

