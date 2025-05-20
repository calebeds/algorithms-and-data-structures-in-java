package hashtable.twosumproblem;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgrammingTwoSumSolution {
    private int[] nums;
    private int S;
    private Map<Integer, Integer> hashTable;

    public DynamicProgrammingTwoSumSolution(int[] nums, int S) {
        this.nums = nums;
        this.S = S;
        this.hashTable = new HashMap<>();
    }

    // we can eliminate the second for loop with a hash table (running time memory complexity tradeoff)
    public void solve() {
        for (int i = 0; i < nums.length; i++) {
            // check the remainder (actual value - target value)
            int remainder = S - nums[i];

            // check if the remainder exists in the hashtable in the hashtable: it means we have found a pair
            if(hashTable.containsValue(remainder)) {
                System.out.printf("Solution: %d + %d = %d%n", nums[i], remainder, S);
            }

            // add the current number to the hash table
            hashTable.put(i, nums[i]);
        }
    }
}
