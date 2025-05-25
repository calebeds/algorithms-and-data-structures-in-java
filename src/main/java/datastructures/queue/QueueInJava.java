package datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        // we process the items in a first come first served manner
        Queue<Task> queue = new LinkedList<>();

        // add() method inserts a new item into the queue in O(1)
        queue.add(new Task(1));
        queue.add(new Task(2));
        queue.add(new Task(3));

        // element() we can return without removing the first item
//        System.out.println(queue.element());
//
//        System.out.println(queue.size());

        // remove() method is a dequeue() method in O(1)
        while (!queue.isEmpty()) {
           Task task = queue.remove();
           task.execute();
        }

    }
}
