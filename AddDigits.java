import java.util.ArrayList;

// https://leetcode.com/problems/add-digits/description/
public class AddDigits {
    public static void main(String[] args) {
        AddDigitsSolution addDigitsSolution = new AddDigitsSolution();
        System.out.println(addDigitsSolution.addDigits(38));
    }
}

class AddDigitsSolution {
    public int addDigits(int num) {
        int sum;
        int digit;
        do {
            sum = 0;
            while (num > 0) {
                digit = num%10;
                num = num/10;
                sum = sum + digit;
            }
            num = sum;
        } while (sum >= 10);

        return sum;
    }
}
