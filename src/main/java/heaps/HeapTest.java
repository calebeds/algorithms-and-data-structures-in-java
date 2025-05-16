package heaps;

public class HeapTest {
    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.insert(6);
        System.out.println(heap.getMax());
        heap.insert(1);
        System.out.println(heap.getMax());
        heap.insert(12);
        System.out.println(heap.getMax());
        heap.insert(-2);
        System.out.println(heap.getMax());
        heap.insert(3);
        System.out.println(heap.getMax());
        heap.insert(8);
        System.out.println(heap.getMax());
        heap.insert(-5);
        System.out.println(heap.getMax());

        System.out.printf("Heap sort %n%n");
        heap.heapSort();

    }
}
