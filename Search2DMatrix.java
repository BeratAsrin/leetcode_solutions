// https://leetcode.com/problems/search-a-2d-matrix/description/

public class Search2DMatrix {
    public static void main(String[] args) {
        Search2DMatrixSolution solution = new Search2DMatrixSolution();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(solution.searchMatrix(matrix, target));
    }
}

class Search2DMatrixSolution {
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
