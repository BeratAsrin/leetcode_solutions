// https://leetcode.com/problems/a-number-after-a-double-reversal/description/
public class NumberAfterDoubleReversal {
    public static void main(String[] args) {
        NumberAfterDoubleReversalSolution solution = new NumberAfterDoubleReversalSolution();
        System.out.println(solution.isSameAfterReversals(526));
    }
}

class NumberAfterDoubleReversalSolution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        String stringNum = Integer.toString(num);
        if (stringNum.charAt(stringNum.length()-1) == '0') {
            return false;
        }
        return true;
    }
}