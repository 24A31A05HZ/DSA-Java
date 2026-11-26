package Algorithms.Sorting;
import java.util.Arrays;

public class RadixSort {

    static void radixSort(int[] arr) {

        if (arr.length == 0) {
            return;
        }

        int max = arr[0];

        for (int num : arr) {
            if (num < 0) {
                throw new IllegalArgumentException(
                    "RadixSort supports only non-negative integers"
                );
            }

            max = Math.max(max, num);
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);

            if (exp > Integer.MAX_VALUE / 10) {
                break;
            }
        }
    }

    static void countingSortByDigit(int[] arr, int exp) {

        int n = arr.length;

        int[] output = new int[n];
        int[] count = new int[10];

        // Count digit occurrences
        for (int num : arr) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        // Calculate cumulative counts
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array from right to left (stable)
        for (int i = n - 1; i >= 0; i--) {

            int digit = (arr[i] / exp) % 10;

            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
