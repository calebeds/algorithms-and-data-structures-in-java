package bubblesort;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11};

        BubbleSort bubbleSort = new BubbleSort(nums);
        bubbleSort.sort();
    }
}
