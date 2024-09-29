import java.util.Random;

public class Lab333 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        int[][] array = initializeArray(rows, cols);
        printArray(array);

        int targetRow = 2;
        int targetCol = 2;

        int count = countAdjacentOnes(array, targetRow, targetCol);
        System.out.println("The number of pairs of adjacent elements that equal 1 for element (2;2): " + count);
    }

    public static int[][] initializeArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(2);
            }
        }

        return array;
    }

    public static void printArray(int[][] array) {
        System.out.println("Двовимірний масив:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int countAdjacentOnes(int[][] array, int row, int col) {
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidIndex(array, i, j) && !(i == row && j == col) && array[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isValidIndex(int[][] array, int row, int col) {
        return row >= 0 && row < array.length && col >= 0 && col < array[0].length;
    }
}
