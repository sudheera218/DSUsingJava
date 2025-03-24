package com.stack;

public class StackDSA {

    int[] stackStorage;
    int top;
    int capacity;

    // Constructor
    public StackDSA(int capacity) {
        this.capacity = capacity;
        this.stackStorage = new int[capacity];
        this.top = -1;
    }

    // Check if stack is full
    public boolean isStackFull() {
        return top == capacity - 1;
    }

    // Check if stack is empty
    public boolean isStackEmpty() {
        return top == -1;
    }

    // Push element to stack
    public boolean push(int item) {
        if (isStackFull()) {
            System.out.println("Stack Overflow! Cannot push: " + item);
            return false;
        }
        stackStorage[++top] = item;
        System.out.println("Pushed: " + item);
        return true;
    }

    // Pop element from stack
    public int pop() {
        if (isStackEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
        return stackStorage[top--];
    }

    // Peek top element
    public int peek() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackStorage[top];
    }

    // Print stack contents
    public void printStack() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements (bottom → top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackStorage[i] + " ");
        }
        System.out.println();
    }

    // Getters for top and capacity
    public int getTop() {
        return top;
    }

    public int getCapacity() {
        return capacity;
    }
}