import java.util.Arrays;

// https://leetcode.com/problems/height-checker/description/
public class HeightChecker {
    public static void main(String[] args) {
        HeightCheckerSolution heightCheckerSolution = new HeightCheckerSolution();
        System.out.println(heightCheckerSolution.heightChecker(new int[]{1,1,4,2,1,3}));
    }
}

class HeightCheckerSolution {
    public int heightChecker(int[] heights) {
        int[] backUp = new int[heights.length];
        int counter = 0;

        for (int i=0; i<heights.length; i++) {
            backUp[i] = heights[i];
        }

        Arrays.sort(heights);

        for (int i=0; i<backUp.length; i++) {
            if (backUp[i] != heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}