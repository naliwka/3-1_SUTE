import java.util.Arrays;
public class Lab313 {
    public static void main(String[] args) {
        double[] array = {1.5, -2.0, 3.2, -4.7, 5.1, 6.0, -7.3, 8.6, 9.2};

        double negativeSum = calculateNegativeSum(array);
        System.out.println("Sum of negative elements: " + negativeSum);

        double productBetweenMinMax = calculateProductBetweenMinMax(array);
        System.out.println("Product between min and max: " + productBetweenMinMax);

        Arrays.sort(array);;
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static double calculateNegativeSum(double[] array) {
        double sum = 0;
        for (double element : array) {
            if (element < 0) {
                sum += element;
            }
        }
        return sum;
    }

    public static double calculateProductBetweenMinMax(double[] array) {
        if (array.length < 2) {
            return 0;
        }

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int start = Math.min(minIndex, maxIndex) + 1;
        int end = Math.max(minIndex, maxIndex);
        double product = 1;

        for (int i = start; i < end; i++) {
            product *= array[i];
        }

        return product;
    }
}
