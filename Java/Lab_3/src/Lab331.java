import java.util.Arrays;
public class Lab331 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 2, 8},
                {1, 7, 4, 6},
                {9, 3, 5, 2}
        };

        printMinElementAndIndex(matrix);
    }

    public static void printMinElementAndIndex(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int minElement = matrix[i][0];
            int minIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minIndex = j;
                }
            }

            System.out.println("Minimum element in a row " + i + ": Value = " + minElement + ", Index = " + minIndex);
        }
    }
}
