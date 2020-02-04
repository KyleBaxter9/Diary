import java.util.Collections;

public class Job {

    private String description;
    private int priority;
    private boolean completed;

    public Job () {
    }

    public Job(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void markCompleted() {
        this.priority = 0;
        this.completed = true;
    }

    public String display() {
        return null;
    }

}
