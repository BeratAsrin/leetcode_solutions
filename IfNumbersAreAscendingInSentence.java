public class IfNumbersAreAscendingInSentence {
    public static void main(String[] args) {
        IfNumbersAreAscendingInSentenceSolution solution = new IfNumbersAreAscendingInSentenceSolution();
        System.out.println(solution.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
    }
}

class IfNumbersAreAscendingInSentenceSolution {
    public boolean areNumbersAscending(String s) {
        int lastNumber = -1;
        int newNumber;
        String[] words = s.split(" ");
        for (String string:words) {
            try {
                newNumber = Integer.parseInt(string);
                if (lastNumber == -1) {
                    lastNumber = newNumber;
                }
                else {
                    if (newNumber > lastNumber) {
                        lastNumber = newNumber;
                    }
                    else {
                        return false;
                    }
                }
            }
            catch (Exception e) {
                continue;
            }
        }
        return true;
    }
}