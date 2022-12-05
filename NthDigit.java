// https://leetcode.com/problems/nth-digit/
public class NthDigit {
    public static void main(String[] args) {
        NthDigitSolution nthDigitSolution = new NthDigitSolution();
        System.out.println(nthDigitSolution.findNthDigit(1));
    }
}

class NthDigitSolution {
    public int findNthDigit(int n) {
        int i = 0;
        int noOfDigits = 0;
        int temp = 1;
        while(true){
            i++;
            while (temp <= i) {
                noOfDigits++;
                temp *= 10;
            }
            if (noOfDigits < n){
                n = n - noOfDigits;
            }
            else{
                return Integer.parseInt(String.valueOf(Integer.toString(i).charAt(n-1)));
            }
        }
    }
}