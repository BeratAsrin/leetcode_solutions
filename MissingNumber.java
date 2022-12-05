// https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        MissingNumberSolution missingNumberSolution = new MissingNumberSolution();
        System.out.println(missingNumberSolution.missingNumber(new int[]{0}));
    }
}

class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int biggest = nums[0];
        boolean isZeroIncluded = false;
        for (int i:nums){
            if (i>biggest){
                biggest = i;
            }
            if (i == 0){
                isZeroIncluded = true;
            }
            sum = sum + i;
        }
        if (!isZeroIncluded){
            return 0;
        }
        int ans = ((biggest * (biggest+1))/2) - sum;
        if (ans == 0){
            for (int i:nums){
                if (biggest-1==i || biggest == 0){
                    return biggest+1;
                }
            }
            return biggest-1;
        }
        return ans;
    }
}