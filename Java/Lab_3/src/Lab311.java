import java.util.Arrays;
public class Lab311 {
    public static void main(String[] args) {
        int[] array = {3, -5, 8, -2, 7, -1, 9, 10, -1, 6};
        System.out.println("Original Array: " + Arrays.toString(array));
        replaceNegativesBeforeMax(array);
        System.out.println("Modified Array: " + Arrays.toString(array));
    }
    public static void replaceNegativesBeforeMax(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < maxIndex; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
    }
}
