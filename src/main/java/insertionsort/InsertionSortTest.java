package insertionsort;


public class InsertionSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11};

        InsertionSort insertionSort = new InsertionSort(nums);
        insertionSort.sort();

        insertionSort.showArray();
    }
}
