package datastructures.queue;

public class Task {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void execute() {
        System.out.printf("Executing task with id: %n%d", id);
    }
}
