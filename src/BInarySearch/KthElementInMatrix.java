package BInarySearch;

public class KthElementInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,4},
                          {5,6,7},
                          {8,9,10}};


        int k = 4;
        KthElementInMatrix find = new KthElementInMatrix();
        System.out.println(find.findKelemrnt(matrix, k));
    }

    public int findKelemrnt(int[][] matrix, int k) {
        if (matrix == null || matrix[0].length == 0){
            return -1;
        }

        int row = k / matrix[0].length;
        int col = k % matrix[0].length;
        return matrix[row][col];
    }
}
