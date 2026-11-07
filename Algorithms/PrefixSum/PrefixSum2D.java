package Algorithms.PrefixSum;


public class PrefixSum2D {

    static int[][] buildPrefixSum(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Extra row and column simplify boundary handling
        int[][] prefix = new int[rows + 1][cols + 1];

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                prefix[i][j] =
                        matrix[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        return prefix;
    }

    // Sum of rectangle from (r1, c1) to (r2, c2)
    static int rectangleSum(
            int[][] prefix,
            int r1, int c1,
            int r2, int c2) {

        return prefix[r2 + 1][c2 + 1]
                - prefix[r1][c2 + 1]
                - prefix[r2 + 1][c1]
                + prefix[r1][c1];
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] prefix = buildPrefixSum(matrix);

        // Rectangle from (0,0) to (1,1)
        System.out.println(
                "Rectangle Sum: "
                + rectangleSum(prefix, 0, 0, 1, 1)
        );
    }
}
