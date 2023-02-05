// https://leetcode.com/problems/perfect-number/
public class PerfectNumber {
    public static void main(String[] args) {
        PerfectNumberSolution solution = new PerfectNumberSolution();
        System.out.println(solution.checkPerfectNumber(28));
    }
}

class PerfectNumberSolution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i=1; i<=num/2; i++) {
            if (num%i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            return true;
        }
        return false;
    }
}