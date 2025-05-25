package datastructures.arrays;

public class PalindromeProblem {
    // it has O(n) linear running time complexity
    public boolean solve(String s) {
        int forward = 0;
        int backward = s.length() - 1;

        while (forward < backward) {
            if(s.charAt(forward) != s.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeProblem problem = new PalindromeProblem();
        System.out.println(problem.solve("madam"));
    }
}
