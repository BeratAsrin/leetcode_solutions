// https://leetcode.com/problems/powx-n/

public class ImplementPow {
    public static void main(String[] args) {
        ImplementPowSolution solution = new ImplementPowSolution();
        System.out.println(solution.myPow(2,10));
    }
}

class ImplementPowSolution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}