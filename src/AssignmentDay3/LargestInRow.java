package AssignmentDay3;

public class LargestInRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 5, 1},
            {7, 2, 8},
            {4, 9, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Largest in row " + i + ": " + max);
        }
    }
}