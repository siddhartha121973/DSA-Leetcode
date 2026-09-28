class Solution {

    void makezero(int[][] matrix, int a, int b) {

        // Make the complete column b zero
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][b] = 0;
        }

        // Make the complete row a zero
        for (int j = 0; j < matrix[a].length; j++) {
            matrix[a][j] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {

        // Store original zero positions
        int[][] zeroPositions = new int[matrix.length * matrix[0].length][2];
        int count = 0;

        // First: find all original zeros
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 0) {
                    zeroPositions[count][0] = i;
                    zeroPositions[count][1] = j;
                    count++;
                }
            }
        }

        // Second: make rows and columns zero
        for (int k = 0; k < count; k++) {
            int row = zeroPositions[k][0];
            int col = zeroPositions[k][1];

            makezero(matrix, row, col);
        }
    }
}