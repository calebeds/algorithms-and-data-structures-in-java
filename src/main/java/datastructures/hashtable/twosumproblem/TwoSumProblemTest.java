package datastructures.hashtable.twosumproblem;

public class TwoSumProblemTest {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, -4, 8, 11};
        int S = 7;

//        NaiveSolution naiveSolution = new NaiveSolution(nums, S);
//        naiveSolution.solve();

        DynamicProgrammingTwoSumSolution dynamicProgrammingTwoSumSolution = new DynamicProgrammingTwoSumSolution(nums, S);
        dynamicProgrammingTwoSumSolution.solve();
    }
}
