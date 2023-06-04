public class SortingSentence {
    public static void main(String[] args) {
        SortingSentenceSolution solution = new SortingSentenceSolution();
        System.out.println(solution.sortSentence("is2 sentence4 This1 a3"));
    }
}

class SortingSentenceSolution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] trueOrder = new String[words.length];
        char index;
        for (String string:words) {
            index = string.charAt(string.length()-1);
            trueOrder[Integer.parseInt(String.valueOf(index))-1] = string.substring(0,string.length()-1);
        }
        return String.join(" ", trueOrder);
    }
}