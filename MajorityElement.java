import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public static void main(String[] args) {
        MajorityElementSolution majorityElement = new MajorityElementSolution();
        System.out.println(majorityElement.majorityElement(new int[]{3,3,4}));
    }
}

class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        int ans=nums[0], counter=0;
        int tempCounter;
        for (int i=0; i<nums.length; i++){
            tempCounter = 0;
            if (nums[i] == ans && i!=0){
                continue;
            }
            for(int j=0; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    tempCounter ++;
                }
            }
            if (tempCounter > counter){
                ans = nums[i];
                counter = tempCounter;
            }
        }
        return ans;
    }
}