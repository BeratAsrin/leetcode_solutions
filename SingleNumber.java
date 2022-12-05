// https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumberSolution singleNumberSolution = new SingleNumberSolution();
        System.out.println(singleNumberSolution.singleNumber(new int[]{2,2,1}));
    }
}

class SingleNumberSolution {
    public int singleNumber(int[] nums) {
        int counter = 0, ans=nums[0];
        for(int i:nums){
            counter = 0;
            for(int j:nums){
                if (counter > 1){
                    break;
                }
                else if (i==j){
                    counter++;
                }
            }
            if (counter == 1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
