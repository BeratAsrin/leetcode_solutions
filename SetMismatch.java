import java.lang.reflect.Array;
import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {
    public static void main(String[] args) {
        SetMismatchSolution setMismatchSolution = new SetMismatchSolution();
        System.out.println(Arrays.toString(setMismatchSolution.findErrorNums(new int[]{2,3,3,4,5,6})));
    }
}

class SetMismatchSolution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        for (int i=1;i<nums.length;i++){
            if (nums[i] == nums[i-1]){
                ans[0] = nums[i];
            }
        }
        boolean flag = false;
        for (int i=1;i<=nums.length;i++){
            flag = false;
            for (int j=0;j<nums.length;j++){
                if (nums[j] == i){
                    flag = true;
                }
            }
            if (flag == false) {
                ans[1] = i;
            }
        }
        return ans;
    }
}