package sortingalgorithms.bogosort;

public class BogoSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11};

        BogoSort bogoSort = new BogoSort(nums);
        bogoSort.sort();

    }
}
