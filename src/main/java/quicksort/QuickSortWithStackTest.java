package quicksort;

public class QuickSortWithStackTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11};

        QuickSortWithStack quickSort = new QuickSortWithStack(nums);
        quickSort.sort();
        quickSort.showSortedArray();
    }
}
