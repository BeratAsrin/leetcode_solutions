import java.util.Arrays;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTargetSolution findSmallestLetterGreaterThanTargetSolution =
                new FindSmallestLetterGreaterThanTargetSolution();
        System.out.println(findSmallestLetterGreaterThanTargetSolution.nextGreatestLetter(new char[] {'x', 'y'},
                'z'));
    }
}

class FindSmallestLetterGreaterThanTargetSolution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = 0;
        Arrays.sort(letters);
        for (int i=0; i<letters.length; i++) {
            if (letters[i] > target) {
                ans = letters[i];
                break;
            }
        }
        if (ans == 0) {
            return letters[0];
        }
        return ans;
    }
}