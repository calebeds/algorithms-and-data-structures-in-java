package sortingalgorithms.mergesort;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11};
        MergeSort mergeSort = new MergeSort(nums);
        mergeSort.sort();
        mergeSort.showArray();
    }
}
