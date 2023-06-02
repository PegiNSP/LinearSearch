import java.util.Arrays;

public class Linear {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        // Linear Search
        long startTime = System.currentTimeMillis();
        int linearIndex = linearSearch(array, target);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        if (linearIndex != -1) {
            System.out.println("Linear Search: Element found at index " + linearIndex);
        } else {
            System.out.println("Linear Search: Element not found");
        }
        System.out.println("Execution time (Linear Search): " + executionTime + " milliseconds");

        // Binary Search
        startTime = System.currentTimeMillis();
        int binaryIndex = binarySearch(array, target);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        if (binaryIndex != -1) {
            System.out.println("Binary Search: Element found at index " + binaryIndex);
        } else {
            System.out.println("Binary Search: Element not found");
        }
        System.out.println("Execution time (Binary Search): " + executionTime + " milliseconds");
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
