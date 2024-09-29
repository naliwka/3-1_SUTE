import java.util.Arrays;

public class Lab316 {
    public static void main(String[] args) {
        double[] array = {3.2, -5.1, 8.7, -2.3, 7.8, -1.5, 9.4, 10.1, 6.3, -4.2};

        int negativeCount = countNegativeElements(array);
        System.out.println("Number of negative elements: " + negativeCount);

        double sumAfterMinAbsolute = calculateSumAfterMinAbsolute(array);
        System.out.println("The sum of the absolute elements after the minimum absolute: " + sumAfterMinAbsolute);

        replaceNegativesWithSquares(array);

        Arrays.sort(array);

        System.out.println("Transformed array: " + Arrays.toString(array));
    }

    public static int countNegativeElements(double[] array) {
        int count = 0;
        for (double element : array) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }

    public static double calculateSumAfterMinAbsolute(double[] array) {
        if (array.length == 0) {
            return 0;
        }

        double minAbsolute = Math.abs(array[0]);
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            double absoluteValue = Math.abs(array[i]);
            if (absoluteValue < minAbsolute) {
                minAbsolute = absoluteValue;
                minIndex = i;
            }
        }

        double sum = 0;
        for (int i = minIndex + 1; i < array.length; i++) {
            sum += Math.abs(array[i]);
        }

        return sum;
    }

    public static void replaceNegativesWithSquares(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] * array[i];
            }
        }
    }
}
