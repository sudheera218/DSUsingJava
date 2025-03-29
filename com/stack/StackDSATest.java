package com.stack;

import java.util.Scanner;

public class StackDSATest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter stack capacity: ");
        int capacity = scanner.nextInt();

        StackDSA stack = new StackDSA(capacity);

        int choice;
        int item;
        do {
            System.out.println("\n========= Stack Menu =========");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Full");
            System.out.println("5. Is Empty");
            System.out.println("6. Print Stack");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter item to push: ");
                item = scanner.nextInt();
                stack.push(item);
            } else if (choice == 2) {
                item = stack.pop();
                if (item != -1) {
                    System.out.println("Popped: " + item);
                }
            } else if (choice == 3) {
                item = stack.peek();
                if (item != -1) {
                    System.out.println("Top item: " + item);
                }
            } else if (choice == 4) {
                if (stack.isStackFull()) {
                    System.out.println("Stack is full.");
                } else {
                    System.out.println("Stack is not full.");
                }
            } else if (choice == 5) {
                if (stack.isStackEmpty()) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Stack is not empty.");
                }
            } else if (choice == 6) {
                stack.print();
            } else if (choice == 7) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice.");
            }

            // Show current stack info
            System.out.println("Top Index     : " + stack.getTop());
            System.out.println("Stack Capacity: " + stack.getCapacity());

        } while (choice != 7);

        scanner.close();
    }
}
