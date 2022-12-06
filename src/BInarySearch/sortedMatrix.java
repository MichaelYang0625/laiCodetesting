package BInarySearch;

import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        int[][] Matrix = {{1,2,3}, {4,5,7}, {8,9,10}};
        int target = 7;

        sortedMatrix sortedMatrix1 = new sortedMatrix();
        System.out.println(Arrays.toString(sortedMatrix1.search(Matrix, target)));
    }

    public int[] search(int[][] matrix, int target){
        if(matrix.length == 0 || matrix[0].length == 0){
            return new int[] {-1, -1};
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            if (matrix[row][col] == target){
                return new int[] {row, col};
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return new int[] {-1,-1};
    }
}
