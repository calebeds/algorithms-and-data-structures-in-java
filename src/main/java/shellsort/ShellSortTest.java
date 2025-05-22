package shellsort;


public class ShellSortTest {
    public static void main(String[] args) {
        int[] nums = {3, 2};

        ShellSort shellSort = new ShellSort(nums);
        shellSort.sort();

        shellSort.showArray();
    }
}
