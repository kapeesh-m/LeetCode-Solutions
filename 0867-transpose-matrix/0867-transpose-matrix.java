class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;         // number of rows
        int n = matrix[0].length;      // number of columns

        int[][] arr = new int[n][m];   // transposed matrix

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = matrix[i][j]; // transpose by flipping indices
            }
        }

        return arr;
    }
}
