import java.util.Arrays;
public class Lab314 {
    public static void main(String[] args) {
        int[] array = {3, -5, 8, -2, 7, 0, -1, 9, 10};

        int minAbsElement = findMinAbsoluteElement(array);
        System.out.println("Min absolute element: " + minAbsElement);

        int sumAfterZero = calculateSumAfterZero(array);
        System.out.println("Sum of absolute elements after zero: " + sumAfterZero);

        transformArray(array);
        System.out.println("Transformed array: " + Arrays.toString(array));
    }

    public static int findMinAbsoluteElement(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int minAbsElement = Math.abs(array[0]);

        for (int i = 1; i < array.length; i++) {
            int absValue = Math.abs(array[i]);
            if (absValue < minAbsElement) {
                minAbsElement = absValue;
            }
        }

        return minAbsElement;
    }

    public static int calculateSumAfterZero(int[] array) {
        boolean zeroFound = false;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (zeroFound) {
                sum += Math.abs(array[i]);
            }

            if (array[i] == 0) {
                zeroFound = true;
            }
        }

        return sum;
    }

    public static void transformArray(int[] array) {
        int length = array.length;
        int[] transformedArray = new int[length];
        int evenIndex = 0;
        int oddIndex = length / 2;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                transformedArray[evenIndex] = array[i];
                evenIndex++;
            } else {
                transformedArray[oddIndex] = array[i];
                oddIndex++;
            }
        }

        System.arraycopy(transformedArray, 0, array, 0, length);
    }
}
