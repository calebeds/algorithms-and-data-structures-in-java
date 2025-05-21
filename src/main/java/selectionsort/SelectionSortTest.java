package selectionsort;

public class SelectionSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 10, 1, 0, 11};

        SelectionSort selectionSort = new SelectionSort(nums);
        selectionSort.sort();

        selectionSort.showArray();

    }
}
