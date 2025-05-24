package timsort;


public class InsertionSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11, 5, 3, 8, 10, 1, 0, 11, 5, 3, 8, 10, 1, 0, 11, 5, 3, 8, 10, 1, 0, 11, 5, 3, 8, 10, 1, 0, 11, 5, 3, 8, 10, 1, 0, 11, 5, 3, 8, 10, 1, 0, 11, 5, 3, 8, 10, 1, 0, 11,5, 3, 8, 10, 1, 0, 11,5, 3, 8, 10, 1, 0, 11,5, 3, 8, 10, 1, 0, 11};

        TimSort timSort = new TimSort(nums);
        timSort.sort();

        timSort.showArray();
    }
}
