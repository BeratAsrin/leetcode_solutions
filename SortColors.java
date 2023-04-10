// https://leetcode.com/problems/sort-colors/
public class SortColors {
    public static void main(String[] args) {
        SortColorsSolution solution = new SortColorsSolution();
        solution.sortColors(new int[]{2,0,2,1,1,0});
    }
}

class SortColorsSolution {
    public void sortColors(int[] nums) {
        int temp;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}