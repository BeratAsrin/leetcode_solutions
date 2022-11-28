//https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();
        System.out.println(palindromeNumberSolution.isPalindrome(121));
    }
}

class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();
        if(original.equals(reversed)){
            return true;
        }
        return false;
    }
}