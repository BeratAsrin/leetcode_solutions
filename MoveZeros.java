import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
    public static void main(String[] args) {
        MoveZerosSolution moveZerosSolution = new MoveZerosSolution();
        moveZerosSolution.moveZeroes(new int[] {0,1,0,3,12});
    }
}

class MoveZerosSolution {
    public void moveZeroes(int[] nums) {
        int temp;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
