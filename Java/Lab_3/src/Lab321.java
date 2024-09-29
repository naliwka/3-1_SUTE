import java.util.Arrays;
import java.util.Random;

public class Lab321 {
    public static void main(String[] args) {
        int arraySize = 200;
        int[] array = generateRandomArray(arraySize, -50, 50);

        System.out.println("Generated array: " + Arrays.toString(array));

        int count = countAdjacentPairs(array);
        System.out.println("The number of pairs of adjacent elements with the same values: " + count);
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        return array;
    }

    public static int countAdjacentPairs(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            }
        }

        return count;
    }
}
