import java.util.Arrays;
import java.util.stream.IntStream;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArraySolution solution = new MergeSortedArraySolution();
        solution.merge(new int[] {-1,0,0,3,3,3,0,0,0}, 6, new int[] {1,2,2}, 3);
    }
}

class MergeSortedArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m; i<nums1.length; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}