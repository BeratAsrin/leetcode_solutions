import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagramSolution solution = new ValidAnagramSolution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }
}

class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        char[]charArrayS = s.toCharArray();
        char[]charArrayT = t.toCharArray();
        if (charArrayS.length != charArrayT.length) {
            return false;
        }
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);
        for (int i=0;i<charArrayS.length;i++){
            if (charArrayS[i] != charArrayT[i]) {
                return false;
            }
        }
        return true;
    }
}