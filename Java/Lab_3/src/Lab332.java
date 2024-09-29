public class Lab332 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, -1, 3},
                {4, 7, -2},
                {-3, 5, 1}
        };

        int product = calculateMainDiagonalProduct(matrix);

        System.out.println("Product of the positive elements of the main diagonal: " + product);
    }

    public static int calculateMainDiagonalProduct(int[][] matrix) {
        int product = 1;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                product *= matrix[i][i];
            }
        }

        return product;
    }
}
