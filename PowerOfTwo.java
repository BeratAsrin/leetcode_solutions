// https://leetcode.com/problems/power-of-two/
// Same code applies for power of 3 and 4 if n/2 is changed with the related number.
public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwoSolution powerOfTwoSolution = new PowerOfTwoSolution();
        System.out.println(powerOfTwoSolution.isPowerOfTwo(16777217));
    }
}

class PowerOfTwoSolution {
    public boolean isPowerOfTwo(int n) {
        double result;
        if (n <= 0) {
            return false;
        }
        while (n>0) {
            result = (double)n/2;
            if (result != (int) result && n > 1) {
                return false;
            }
            n = n/2;
        }
        return true;
    }
}