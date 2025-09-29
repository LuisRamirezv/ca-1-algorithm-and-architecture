/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author telmuun
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Data Structure:");
        System.out.println("1. Stack");
        System.out.println("2. Queue");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            runStackApp(scanner);
        } else if (choice == 2) {
            runQueueApp(scanner);
        } else {
            System.out.println("Invalid choice. Exiting...");
        }

        scanner.close();
    }

    // Stack
    private static void runStackApp(Scanner scanner) {
        Stack<Integer> stack = new Stack<>();
        int choice;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push: ");
                    int num = scanner.nextInt();
                    stack.push(num);
                    System.out.println(num + " pushed onto the stack.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Top element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 4:
                    System.out.println("Current Stack: " + stack);
                    break;
                case 5:
                    System.out.println("Exiting Stack program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // Queue
    private static void runQueueApp(Scanner scanner) {
        Queue<Integer> queue = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to enqueue: ");
                    int num = scanner.nextInt();
                    queue.add(num);
                    System.out.println(num + " added to the queue.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Dequeued: " + queue.remove());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Front element: " + queue.peek());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 4:
                    System.out.println("Current Queue: " + queue);
                    break;
                case 5:
                    System.out.println("Exiting Queue program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}

