package com.ds.queue;

public class Queue {

    private int capacity;
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    // Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
        } else {
            rear++;
            queueArray[rear] = item;
            size++;
            System.out.println("Enqueued: " + item);
        }
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return -1;
        } else {
            int item = queueArray[front];
            front++;
            size--;
            return item;
        }
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // Check if full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print all elements
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue items (front to rear):");
            for (int i = front; i <= rear; i++) {
                System.out.println(queueArray[i]);
            }
        }
    }

    // Get front index
    public int getFront() {
        return front;
    }

    // Get rear index
    public int getRear() {
        return rear;
    }
}
