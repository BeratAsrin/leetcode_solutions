// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseIntegerSolution solution = new ReverseIntegerSolution();
        System.out.println(solution.reverse(102));
    }
}

class ReverseIntegerSolution {
    public int reverse(int x) {
        String stringX = Integer.toString(x);
        int stopIndex=0;
        if (stringX.charAt(stringX.length()-1) == '0'){
            for (int i=stringX.length()-1; i>=1; i--) {
                if (stringX.charAt(i) == '0' && stringX.charAt(i-1) != '0') {
                    stopIndex = i;
                    break;
                }
            }
            if (stopIndex != 0)
                stringX = stringX.substring(0, stopIndex);
        }
        stringX = new StringBuilder(stringX).reverse().toString();
        if (stringX.contains("-")) {
            stringX = "-" + stringX.substring(0,stringX.length()-1);
        }
        try {
            return Integer.parseInt(stringX);
        }
        catch (Exception e) {
            return 0;
        }
    }
}
