import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/third-maximum-number/
public class ThirdMaxNumber {
    public static void main(String[] args) {
        ThirdMaxNumberSolution thirdMaxNumberSolution = new ThirdMaxNumberSolution();
        System.out.println(thirdMaxNumberSolution.thirdMax(new int[]{1,2,2}));
    }
}

class ThirdMaxNumberSolution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        for (int i=0;i<=nums.length-1;i++){
            if(i == nums.length-1){
                uniqueList.add(nums[i]);
            }
            else if(nums[i] != nums[i+1]){
                uniqueList.add(nums[i]);
            }
        }
        if (uniqueList.size()>=3)
            return uniqueList.get(uniqueList.size()-3);
        else
            return uniqueList.get(uniqueList.size()-1);
    }
}
