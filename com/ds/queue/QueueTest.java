package com.ds.queue;

import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int capacity = scanner.nextInt();

        Queue queue = new Queue(capacity);

        int choice;
        int item;

        do {
            System.out.println("\n========= Queue Menu =========");
            System.out.println("1 - For Enqueue");
            System.out.println("2 - For Dequeue");
            System.out.println("3 - For Peek");
            System.out.println("4 - For Queue Full");
            System.out.println("5 - For Queue Empty");
            System.out.println("6 - For Display Queue items");
            System.out.println("7 - For Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to be inserted into queue: ");
                    item = scanner.nextInt();
                    queue.enqueue(item);
                    break;

                case 2:
                    item = queue.dequeue();
                    if (item != -1) {
                        System.out.println("Dequeued: " + item);
                    }
                    break;

                case 3:
                    item = queue.peek();
                    if (item != -1) {
                        System.out.println("Front item: " + item);
                    }
                    break;

                case 4:
                    if (queue.isFull()) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
                    }
                    break;

                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 6:
                    queue.print();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            // Optional: Display front and rear positions
            System.out.println("Front Index : " + queue.getFront());
            System.out.println("Rear Index  : " + queue.getRear());

        } while (choice != 7);

        scanner.close();
    }
}