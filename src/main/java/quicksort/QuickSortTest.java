package quicksort;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11};

        QuickSort quickSort = new QuickSort(nums);
        quickSort.sort();
        quickSort.showSortedArray();
    }
}
