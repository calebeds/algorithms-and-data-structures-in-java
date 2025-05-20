package hashtable.twosumproblem;

public class NaiveSolution {
    // the one dimensional array in which we store the integers
    private int[] nums;
    // the S target we are after
    private int S;

    public NaiveSolution(int[] nums, int s) {
        this.nums = nums;
        S = s;
    }

    // because of the nested for loop it has O(N^2) quadratic running time complexity
    public void solve() {
        // we consider all the items in the array
        for (int i = 0; i < nums.length; i++) {
            // for all items we check all other items
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == S) {
                    System.out.printf("Solution: %d + %d = %d%n", nums[i], nums[j], S);
                }
            }
        }
    }
}
