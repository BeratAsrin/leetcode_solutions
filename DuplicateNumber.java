import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-the-duplicate-number/description/
public class DuplicateNumber {
    public static void main(String[] args) {
        DuplicateNumberSolution duplicateNumberSolution = new DuplicateNumberSolution();
        System.out.println(duplicateNumberSolution.findDuplicate(new int[]{3,1,3,4,2}));
    }
}

class DuplicateNumberSolution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i] == nums[i-1]){
                   ans = nums[i];
                   break;
            }
        }
        return ans;
    }
}
