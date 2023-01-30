import java.util.*;
import java.util.stream.IntStream;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        FindAllNumbersDisappearedInArraySolution solution = new FindAllNumbersDisappearedInArraySolution();
        System.out.println(solution.findDisappearedNumbers(new int[] {1,2}));
    }
}

class FindAllNumbersDisappearedInArraySolution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new LinkedList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        boolean flag;
        for (int i=1;i<=nums.length;i++) {
            if (hashMap.containsKey(i)) {
                continue;
            }
            else{
                flag = false;
                for (int j=0;j<nums.length;j++) {
                    if (nums[j] == i) {
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    hashMap.put(i, 1);
                else
                    hashMap.put(i, 0);
            }
        }
        for (Map.Entry<Integer, Integer> map:hashMap.entrySet()) {
            if (map.getValue() == 0) {
                result.add(map.getKey());
            }
        }
        return result;
    }
}