import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        FirstAndLastPositionSolution solution = new FirstAndLastPositionSolution();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10},8)));
    }
}

class FirstAndLastPositionSolution {
    public int[] searchRange(int[] nums, int target) {
        int[] positions = {-1,-1};
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                if (positions[0] == -1) {
                    positions[0] = i;
                }
                else {
                    positions[1] = i;
                }
            }
            else if(positions[0] != -1 && positions[1] != -1) {
                break;
            }
        }
        if(positions[1] == -1) {
            positions[1] = positions[0];
        }
        return positions;
    }
}