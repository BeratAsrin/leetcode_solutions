// https://leetcode.com/problems/monotonic-array/
public class MonotonicArray {
    public static void main(String[] args) {
        MonotonicArraySolution monotonicArraySolution = new MonotonicArraySolution();
        System.out.println(monotonicArraySolution.isMonotonic(new int[] {1,3,2}));
    }
}

class MonotonicArraySolution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = false;
        boolean decreasing = false;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                increasing = true;
            }
            else if (nums[i] < nums[i-1]) {
                decreasing = true;
            }
        }
        if (increasing && decreasing) {
            return false;
        }
        return true;
    }
}
