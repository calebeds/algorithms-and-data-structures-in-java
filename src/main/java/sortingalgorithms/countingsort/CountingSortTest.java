package sortingalgorithms.countingsort;

public class CountingSortTest {
    public static void main(String[] args) {
//        int[] nums = {1, 5, 6, 9, 5, 0, 5};
//        CountingSort countingSort = new CountingSort(nums);
//        countingSort.sort();
//        countingSort.showArray();

        int[] nums = {32, -42, 8, 9, 5, 0, 5};
        CountingSortArbitrary countingSort = new CountingSortArbitrary(nums);
        countingSort.sort();
        countingSort.showArray();
    }
}
