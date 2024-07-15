import java.time.LocalDateTime;

public class Task {
    private String name;
    private LocalDateTime deadline;
    private LocalDateTime createdTime;


    public Task(String name, LocalDateTime deadline) {
        this.name = name;
        this.deadline = deadline;
        this.createdTime = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', deadline=" + deadline + ", createdTime=" + createdTime + '}';
    }
}
