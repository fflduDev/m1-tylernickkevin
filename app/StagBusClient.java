package app;

import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {
    public static void main(String[] args) {
        // LinkedList Operations
        LinkedList busRoute = new LinkedListImpl();
        System.out.println("Building bus route...");
        busRoute.addItem("Station A");
        busRoute.addItem("Station B");
        busRoute.addItem("Station C");
        busRoute.addItem("Station D");
        busRoute.listItems();
        
        System.out.println("Checking if 'Station B' is in the list: " + busRoute.isItemInList("Station B"));
        System.out.println("Checking if 'Station X' is in the list: " + busRoute.isItemInList("Station X"));
        
        System.out.println("Removing 'Station C'...");
        busRoute.deleteItem("Station C");
        busRoute.listItems();
        
        System.out.println("Adding 'Station X' before 'Station B'...");
        busRoute.insertBefore("Station X", "Station B");
        busRoute.listItems();
        
        System.out.println("Adding 'Station Y' after 'Station B'...");
        busRoute.insertAfter("Station Y", "Station B");
        busRoute.listItems();
        
        // Queue Operations
        Queue riderQueue = new QueueImpl(10);
        System.out.println("\nAdding riders to the queue...");
        riderQueue.enQueue("Alice");
        riderQueue.enQueue("Bob");
        riderQueue.enQueue("Charlie");
        riderQueue.enQueue("David");
        riderQueue.enQueue("Eve");
        riderQueue.enQueue("Frank");
        riderQueue.display();
        
        System.out.println("Peek at queue: " + riderQueue.peek());
        
        System.out.println("Removing head from queue...");
        riderQueue.deQueue();
        riderQueue.display();
        
        System.out.println("Adding two more riders...");
        riderQueue.enQueue("Grace");
        riderQueue.enQueue("Hank");
        riderQueue.display();
        
        System.out.println("Peek at queue: " + riderQueue.peek());
        System.out.println("Removing head: " + riderQueue.deQueue());
        riderQueue.display();
        
        // Stack Operations
        Stack riderStack = new StackImpl();
        System.out.println("\nAdding riders to the stack...");
        riderStack.push("Alice");
        riderStack.push("Bob");
        riderStack.push("Charlie");
        riderStack.push("David");
        riderStack.push("Eve");
        riderStack.push("Frank");
        riderStack.display();
        
        System.out.println("Peek at stack: " + riderStack.peek());
        
        System.out.println("Removing top from stack...");
        riderStack.pop();
        riderStack.display();
        
        System.out.println("Peek at stack: " + riderStack.peek());
        System.out.println("Adding two more riders...");
        riderStack.push("Grace");
        riderStack.push("Hank");
        riderStack.display();
        
        System.out.println("Peek at stack: " + riderStack.peek());
        
        System.out.println("Removing all riders from the stack...");
        while (!riderStack.isEmpty()) {
            riderStack.pop();
        }
        System.out.println("Stack is empty: " + riderStack.isEmpty());
    }
}
