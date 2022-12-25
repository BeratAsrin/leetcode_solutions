import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicateSolution containsDuplicateSolution = new ContainsDuplicateSolution();
        System.out.println(containsDuplicateSolution.containsDuplicate(new int[]{1,2,3,4}));

    }
}

class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}