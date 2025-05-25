package datastructures.heaps.checkminheap;

public class CheckMinHeapExample {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        CheckHeap checkHeap = new CheckHeap();

        System.out.println(checkHeap.isMinHeap(nums));
    }
}
