package com.stack;

public class StackDSA {

    int capacity;
    int[] stackArray;
    int top;

    // Constructor
    StackDSA(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    // Push item to stack
    void push(int item) {
        if (isStackFull()) {
            System.out.println("Stack is full. Cannot push " + item);
        } else {
            top++;
            stackArray[top] = item;
            System.out.println("Pushed: " + item);
        }
    }

    // Pop top item
    int pop() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1;
        } else {
            int poppedItem = stackArray[top];
            top--;
            return poppedItem;
        }
    }

    // Peek at top item
    int peek() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if full
    boolean isStackFull() {
        return top == capacity - 1;
    }

    // Check if empty
    boolean isStackEmpty() {
        return top == -1;
    }

    // Show current stack
    void print() {
        System.out.println("Stack Capacity: " + capacity);
        System.out.println("Top Index     : " + top);

        if (isStackEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack items (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    // Return top index
    int getTop() {
        return top;
    }

    // Return capacity
    int getCapacity() {
        return capacity;
    }
}
