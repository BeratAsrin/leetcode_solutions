// https://leetcode.com/problems/find-the-pivot-integer/
public class FindPivotInteger {
    public static void main(String[] args) {
        FindPivotIntegerSolution solution = new FindPivotIntegerSolution();
        System.out.println(solution.pivotInteger(8));
    }
}

class FindPivotIntegerSolution {
    public int pivotInteger(int n) {
        if (n==0 || n==1) {
            return n;
        }
        int firstSum;
        int secondSum;
        for (int i=1;i<=n;i++) {
            firstSum = ((i*(i+1))/2);
            secondSum = ((n*(n+1))/2) - ((i*(i-1))/2);
            if (firstSum == secondSum) {
                return i;
            }
        }
        return -1;
    }
}