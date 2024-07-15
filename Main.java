import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\n=== Task Manager Menu ===");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        // Adding a task
                        System.out.print("Enter task name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter deadline (yyyy-MM-ddHH:mm): ");
                        String deadlineStr = scanner.nextLine();
                        LocalDateTime deadline = LocalDateTime.parse(deadlineStr);

                        taskManager.addTask(name, deadline);
                        System.out.println("Task added successfully.");
                        break;

                    case 2:
                        // Display all tasks
                        taskManager.displayTasks();
                        break;

                    case 3:
                        // Exit
                        System.out.println("Exiting the program.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");

                scanner.next();
                choice = 0;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Correct time format example 2024-07-15T23:59");
                choice = 0;
            }
        } while (choice != 3);

        scanner.close();
    }
}
