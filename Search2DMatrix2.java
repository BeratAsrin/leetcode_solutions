// https://leetcode.com/problems/search-a-2d-matrix-ii/

public class Search2DMatrix2 {
    public static void main(String[] args) {
        Search2DMatrix2Solution solution = new Search2DMatrix2Solution();
        //int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] matrix = {{-5}};
        int target = -5;
        System.out.println(solution.searchMatrix(matrix, target));
    }
}

class Search2DMatrix2Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0; i<matrix.length; i++) {
            if (matrix[i][0] <= target) {
                for (int j=0; j<matrix[0].length; j++) {
                    if (matrix[i][j] > target) {
                        break;
                    }
                    else if(matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}