package sortingalgorithms.radixsort;

public class RadixSortTest {
    public static void main(String[] args) {

        int[] nums = {32, 42, 8, 9, 5, 0, 10000};
        RadixSort countingSort = new RadixSort(nums);
        countingSort.sort();
        countingSort.showArray();
    }
}
