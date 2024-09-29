import java.util.Scanner;
import java.util.Arrays;
public class Lab315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the A number: ");
        double a = scanner.nextDouble();

        double[] array = {1.5, -2.0, 3.2, -4.7, 5.1, 6.0, -7.3, 8.6, 9.2};

        int countLessThanA = countElementsLessThanA(array, a);
        System.out.println("Number of elements that are less than A: " + countLessThanA);

        int sumAfterLastNegative = calculateSumAfterLastNegative(array);
        System.out.println("Sum of the oven numbers after the last negative: " + sumAfterLastNegative);

        transformArray(array);
        System.out.println("Transformed array: " + Arrays.toString(array));
    }

    public static int countElementsLessThanA(double[] array, double a) {
        int count = 0;
        for (double element : array) {
            if (element < a) {
                count++;
            }
        }
        return count;
    }

    public static int calculateSumAfterLastNegative(double[] array) {
        int sum = 0;
        boolean foundNegative = false;

        for (int i = array.length - 1; i >= 0; i--) {
            if (foundNegative) {
                sum += (int) array[i];
            }

            if (array[i] < 0) {
                foundNegative = true;
                break;
            }
        }

        return sum;
    }

    public static void transformArray(double[] array) {
        if (array.length == 0) {
            return;
        }

        double maxElement = array[0];
        for (double element : array) {
            if (element > maxElement) {
                maxElement = element;
            }
        }

        for (int i = 0; i < array.length / 2; i++) {
            if (Math.abs(array[i] - maxElement) <= 0.2 * maxElement) {
                continue;
            }

            int j = i + array.length / 2;

            double temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
