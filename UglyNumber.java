import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/ugly-number/
public class UglyNumber {
    public static void main(String[] args) {
        UglyNumberSolution uglyNumberSolution = new UglyNumberSolution();
        System.out.println(uglyNumberSolution.isUgly(1332185066));
    }
}

class UglyNumberSolution {
    private boolean isPrime (int x) {
        for (int i=2; i<=x/2; i++) {
            if (x%i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isUgly(int n) {
        if (n<=0) {
            return false;
        }
        for (int i=4; i<=n; i++) {
            if (i!=5 && n%i==0) {
                if (isPrime(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}