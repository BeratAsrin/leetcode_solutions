import java.util.Arrays;

// https://leetcode.com/problems/unique-morse-code-words/description/
public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        UniqueMorseCodeWordsSolution uniqueMorseCodeWordsSolution = new UniqueMorseCodeWordsSolution();
        System.out.println(uniqueMorseCodeWordsSolution.uniqueMorseRepresentations(new String[] {"a"}));
    }
}

class UniqueMorseCodeWordsSolution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseTable = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String output;
        String[] outputMorse = new String[words.length];
        int counter = -1;
        for (String word:words) {
            output = "";
            counter++;
            for (int i=0; i<word.length(); i++){
                for (int j=0; j<alphabet.length; j++){
                    if (alphabet[j] == word.charAt(i)) {
                        output = output + morseTable[j];
                        break;
                    }
                }
            }
            outputMorse[counter] = output;
        }
        return Arrays.stream(outputMorse).distinct().toArray(String[]::new).length;
    }
}