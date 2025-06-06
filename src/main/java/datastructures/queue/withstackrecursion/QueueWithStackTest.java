package datastructures.queue.withstackrecursion;

public class QueueWithStackTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(20);

        System.out.println(queue.dequeue());

        queue.enqueue(100);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
