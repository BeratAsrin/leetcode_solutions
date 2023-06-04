import java.util.Arrays;

public class RunningSumOneDArray {
    public static void main(String[] args) {
        RunningSumOneDArraySolution solution = new RunningSumOneDArraySolution();
        System.out.println(Arrays.toString(solution.runningSum(new int[]{1,2,3,4})));
    }
}

class RunningSumOneDArraySolution {
    public int[] runningSum(int[] nums) {
        int[] resultList = new int[nums.length];
        resultList[0] = nums[0];
        for (int i=1;i<nums.length;i++) {
            resultList[i] = resultList[i-1] + nums[i];
        }
        return resultList;
    }
}