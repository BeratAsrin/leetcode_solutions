// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPositionSolution searchInsertPositionSolution = new SearchInsertPositionSolution();
        System.out.println(searchInsertPositionSolution.searchInsert(new int[] {1,3,5,6},7));
    }
}

class SearchInsertPositionSolution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if (nums[0] >= target) {
            return index;
        }
        for (int i=1;i<nums.length;i++) {
            if (nums[i] >= target) {
                index = i;
                break;
            }
        }
        if (index == 0) {
            index = nums.length;
        }
        return index;
    }
}
