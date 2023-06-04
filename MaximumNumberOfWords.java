public class MaximumNumberOfWords {
    public static void main(String[] args) {
        MaximumNumberOfWordsSolution solution = new MaximumNumberOfWordsSolution();
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too",
                "this is great thanks very much"};
        System.out.println(solution.mostWordsFound(sentences));
    }
}

class MaximumNumberOfWordsSolution {
    public int mostWordsFound(String[] sentences) {
        int max=0, counter=0;
        for (String s:sentences) {
            counter = s.split(" ").length;
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }
}