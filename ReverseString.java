// https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        ReverseStringSolution reverseStringSolution = new ReverseStringSolution();
        reverseStringSolution.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}
class ReverseStringSolution {
    public void reverseString(char[] s) {
        char tempChar;
        for(int i=0;i<s.length/2;i++){
            tempChar = s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1] = tempChar;
        }
    }
}