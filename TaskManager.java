import java.util.LinkedList;
import java.time.LocalDateTime;

public class TaskManager {
    private LinkedList<Task> tasks;

    // Constructor
    public TaskManager() {
        tasks = new LinkedList<>();
    }


    public void addTask(String name, LocalDateTime deadline) {
        Task task = new Task(name, deadline);
        tasks.add(task);
    }

    // Display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
