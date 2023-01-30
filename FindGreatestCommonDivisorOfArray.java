import java.util.Arrays;

// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        FindGreatestCommonDivisorOfArraySolution findGreatestCommonDivisorOfArraySolution = new FindGreatestCommonDivisorOfArraySolution();
        System.out.println(findGreatestCommonDivisorOfArraySolution.findGCD(new int[]{5,6,9,2,10}));
    }
}

class FindGreatestCommonDivisorOfArraySolution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gcd = 1;
        for (int i=2; i<=nums[0]; i++) {
            if (nums[0]%i == 0 && nums[nums.length-1]%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}