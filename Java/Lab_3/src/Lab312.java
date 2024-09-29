public class Lab312 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6};
        int maxConsecutiveCount = findMaxConsCount(array);
        System.out.println("Max consecutive count: " + maxConsecutiveCount);
    }
    public static int findMaxConsCount(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int currentCount = 1;
        int maxCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        return maxCount;
    }
}
