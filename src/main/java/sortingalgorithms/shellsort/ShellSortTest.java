package sortingalgorithms.shellsort;


public class ShellSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11};

        ShellSort shellSort = new ShellSort(nums);
        shellSort.sort();

        shellSort.showArray();
    }
}
