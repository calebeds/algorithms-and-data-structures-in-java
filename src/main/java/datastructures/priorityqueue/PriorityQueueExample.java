package datastructures.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // by default the heap is MIN HEAP
        // MAX HEAP when provide Collections.reverseOrder()
//        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
//
//        // O(logN)
//        heap.add(12);
//        heap.add(5);
//        heap.add(7);
//        heap.add(0);
//        heap.add(-2);
//
//        // O(N)
//        heap.contains(0);
//
//        // when we consider all N items in O(logN) = O(NlogN)
//        while (!heap.isEmpty()) {
//            // O(logN)
//            System.out.println(heap.poll());
//        }

        Queue<Person> heap = new PriorityQueue<>();

        // O(logN)
        heap.add(new Person("Kevin", 34));
        heap.add(new Person("Daniel", 12));
        heap.add(new Person("Ana", 67));
        heap.add(new Person("Adam", 18));
        heap.add(new Person("Michael", 33));


        // when we consider all N items in O(logN) = O(NlogN)
        while (!heap.isEmpty()) {
            // O(logN)
            System.out.println(heap.poll());
        }
    }
}
