package sortingalgorithms.quicksort;

import java.io.OptionalDataException;
import java.util.Stack;

public class QuickSortWithStack {
    private final int[] nums;

    public QuickSortWithStack(int[] nums) {
        this.nums = nums;
    }

    public void sort() {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(nums.length - 1);

        while (!stack.isEmpty()) {
            int high = stack.pop();
            int low = stack.pop();

            int pivotIndex = partition(low, high);

            // dealing with the right side (not with recursion)
            if(pivotIndex + 1 < high) {
                stack.push(pivotIndex + 1);
                stack.push(high);
            }

            if(pivotIndex - 1 > low) {
                stack.push(low);
                stack.push(pivotIndex - 1);
            }
        }
    }

    // return the index of the pivot
    private int partition(int low, int high) {
        int pivotIndex = (low + high) / 2;
        swap(pivotIndex, high);

        int i = low;

        for (int j = low; j < high; j++) {
            if(nums[j] <= nums[high]) {
                swap(i, j);
                i++;
            }
        }

        swap(i, high);

        return i;
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void showSortedArray() {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
