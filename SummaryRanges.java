import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/summary-ranges/
public class SummaryRanges {
    public static void main(String[] args) {
        SummaryRangesSolution summaryRangesSolution = new SummaryRangesSolution();
        System.out.println(summaryRangesSolution.summaryRanges(new int[] {}));
    }
}

class SummaryRangesSolution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        List <String> output = new ArrayList<>();
        String start = Integer.toString(nums[0]);
        String stop = "";
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i-1]+1) {
                stop = Integer.toString(nums[i]);
            }
            else {
                output = addToList(start, stop, output);
                start = Integer.toString(nums[i]);
                stop = "";
            }
        }
        output = addToList(start, stop, output);
        return output;
    }

    private List<String> addToList (String start, String stop, List<String> output) {
        if (stop == "") {
            output.add(start);
        }
        else {
            output.add(start + "->" + stop);
        }
        return output;
    }
}
