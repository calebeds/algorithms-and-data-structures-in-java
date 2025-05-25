package sortingalgorithms.timsort;

public class TimSort {
    private final int[] nums;
    private final int[] tempArray;

    public TimSort(int[] nums) {
        this.nums = nums;
        this.tempArray = new int[nums.length];
    }

    public void sort() {
        mergeSort(0, nums.length - 1);
    }

    private void mergeSort(int low, int high) {
        if(high - low < 32) {
            insertionSort(low, high);
            return;
        }

        int middle = (low + high) / 2;

        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        merge(low, middle, high);
    }


    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            tempArray[i] = nums[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while ((i <= middle) && (j <= high)) {
            if(tempArray[i] <= tempArray[j]) {
                nums[k] = tempArray[i];
                i++;
            } else {
                nums[k] = tempArray[j];
                j++;
            }

            k++;
        }

        while (i <= middle) {
            nums[k] = tempArray[i];
            k++;
            i++;
        }

        while (j <= high) {
            nums[k] = tempArray[j];
            k++;
            j++;
        }
    }

    private void insertionSort(int low, int high) {
        for (int i = low + 1; i <= high ; i++) {
            int j = i;

            while (j > low && nums[j - 1] > nums[j]) {
                swap(j, j - 1);
                j--;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void showArray() {
        for (int num: nums) {
            System.out.print(num + " ");
        }
    }
}
