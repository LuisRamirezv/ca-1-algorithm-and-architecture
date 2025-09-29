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

    // A tray with food information
    static class Tray {
        String name;
        double weight;

        Tray(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return name + " (" + weight + "kg)";
        }
    }

    // Max capacity of storage
    private static final int MAX_CAPACITY = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Storage Type:");
        System.out.println("1. Stack (LIFO)");
        System.out.println("2. Queue (FIFO)");
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

    // ================= STACK =================
    private static void runStackApp(Scanner scanner) {
        Stack<Tray> stack = new Stack<>();
        int choice;

        do {
            System.out.println("\n--- Stack Storage Menu ---");
            System.out.println("1. Add Tray (Push)");
            System.out.println("2. Remove Tray (Pop)");
            System.out.println("3. View Top Tray (Peek)");
            System.out.println("4. Display All Trays");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (stack.size() >= MAX_CAPACITY) {
                        System.out.println("Storage is full! Cannot add more trays.");
                    } else {
                        System.out.print("Enter tray name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter tray weight (kg): ");
                        double weight = scanner.nextDouble();
                        Tray tray = new Tray(name, weight);
                        stack.push(tray);
                        System.out.println(tray + " added to stack.");
                    }
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Removed: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Top Tray: " + stack.peek());
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

    // ================= QUEUE =================
    private static void runQueueApp(Scanner scanner) {
        Queue<Tray> queue = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n--- Queue Storage Menu ---");
            System.out.println("1. Add Tray (Enqueue)");
            System.out.println("2. Remove Tray (Dequeue)");
            System.out.println("3. View Front Tray (Peek)");
            System.out.println("4. Display All Trays");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (queue.size() >= MAX_CAPACITY) {
                        System.out.println("Storage is full! Cannot add more trays.");
                    } else {
                        System.out.print("Enter tray name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter tray weight (kg): ");
                        double weight = scanner.nextDouble();
                        Tray tray = new Tray(name, weight);
                        queue.add(tray);
                        System.out.println(tray + " added to queue.");
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Removed: " + queue.remove());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Front Tray: " + queue.peek());
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
