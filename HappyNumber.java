import java.util.ArrayList;
import java.lang.Math;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {
    public static void main(String[] args) {
        HappyNumberSolution happyNumberSolution = new HappyNumberSolution();
        System.out.println(happyNumberSolution.isHappy(19));
    }
}

class HappyNumberSolution {
    public boolean isHappy(int n) {
        int digit;
        ArrayList<Integer> results = new ArrayList<Integer>();
        int number = n;
        int result = 0;

        while (true) {
            result = 0;
            while (number > 0) {
                digit = number%10;
                number = number/10;
                result = (int) (result + Math.pow(digit,2));
            }
            if (results.contains(result)) {
                break;
            }
            else if (result == 1) {
                return true;
            }
            else {
                results.add(result);
            }
            number = result;
        }
        return false;
    }
}