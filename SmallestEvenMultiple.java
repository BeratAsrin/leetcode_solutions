// https://leetcode.com/problems/smallest-even-multiple/description/
public class SmallestEvenMultiple {
    public static void main(String[] args) {
        SmallestEvenMultipleSolution smallestEvenMultipleSolution = new SmallestEvenMultipleSolution();
        System.out.println(smallestEvenMultipleSolution.smallestEvenMultiple(5));
    }
}

class SmallestEvenMultipleSolution {
    public int smallestEvenMultiple(int n) {
        if (n%2 == 0){
            return n;
        }
        else {
            int i = n+1;
            while (!(i%2 == 0 && i%n == 0)) {
                i++;
            }
            return i;
        }
    }
}