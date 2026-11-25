package Algorithms.Sorting;
import java.util.Arrays;

public class CountingSort {

    static void countingSort(int[] arr) {

        if (arr.length == 0) {
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int[] count = new int[max - min + 1];

        // Count occurrences
        for (int num : arr) {
            count[num - min]++;
        }

        // Reconstruct sorted array
        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, -2, 8, 3, -2, 1};

        countingSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
