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
            System.out.println("4. Check if Full");
            System.out.println("5. Check if Empty");
            System.out.println("6. Print Stack");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to push: ");
                    item = scanner.nextInt();
                    stack.push(item);
                    break;

                case 2:
                    item = stack.pop();
                    if (item != -1) {
                        System.out.println("Popped item: " + item);
                    }
                    break;

                case 3:
                    item = stack.peek();
                    if (item != -1) {
                        System.out.println("Top of stack: " + item);
                    }
                    break;

                case 4:
                    System.out.println(stack.isStackFull() ? "Yes, stack is FULL." : "No, stack is NOT full.");
                    break;

                case 5:
                    System.out.println(stack.isStackEmpty() ? "Yes, stack is EMPTY." : "No, stack is NOT empty.");
                    break;

                case 6:
                    stack.printStack();
                    break;

                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
            }

            // Display top and capacity after each operation
            System.out.println("Current Top Index: " + stack.getTop());
            System.out.println("Stack Capacity   : " + stack.getCapacity());

        } while (choice != 7);

        scanner.close();
    }
}