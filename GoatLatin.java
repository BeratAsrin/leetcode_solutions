// https://leetcode.com/problems/goat-latin/
public class GoatLatin {
    public static void main(String[] args) {
        GoatLatinSolution solution = new GoatLatinSolution();
        System.out.println(solution.toGoatLatin("I speak Goat Latin"));
    }
}

class GoatLatinSolution {
    private boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String output = "";
        int index = 0;
        char firstLetter;
        for (String word:words) {
            index++;
            if (index != 1) {
                output = output + " ";
            }
            if (isVowel(Character.toLowerCase(word.charAt(0)))) {
                output = output + word + "ma";
            }
            else {
                firstLetter = word.charAt(0);
                output = output + word.substring(1) + firstLetter + "ma";
            }
            for (int i=0;i<index;i++) {
                output = output + "a";
            }
        }
        return output;
    }
}