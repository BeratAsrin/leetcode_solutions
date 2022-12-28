import java.util.Arrays;

// https://leetcode.com/problems/ransom-note/
public class RansomNote {
    public static void main(String[] args) {
        RansomNoteSolution ransomNoteSolution = new RansomNoteSolution();
        System.out.println(ransomNoteSolution.canConstruct("aa", "ab"));
    }
}

class RansomNoteSolution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteCharArray = ransomNote.toCharArray();
        char[] magazineCharArray = magazine.toCharArray();
        Arrays.sort(ransomNoteCharArray);
        boolean flag = false;
        for (int i=0; i<ransomNoteCharArray.length; i++) {
            flag = false;
            for (int j=0; j<magazineCharArray.length; j++) {
                if (ransomNoteCharArray[i] == magazineCharArray[j]) {
                    flag = true;
                    magazineCharArray[j] = '0';
                    break;
                }
            }
            if (flag == false) {
                return false;
            }
        }
        return true;
    }
}