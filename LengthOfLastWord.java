// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWordSolution sol = new LengthOfLastWordSolution();
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  "));
    }
}

class LengthOfLastWordSolution {
    public int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        return stringArray[stringArray.length-1].length();
    }
}