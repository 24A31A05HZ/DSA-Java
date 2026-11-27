package Algorithms.Sorting;
import java.util.*;

public class BucketSort {

    static void bucketSort(double[] arr) {

        int n = arr.length;

        if (n <= 1) {
            return;
        }

        List<List<Double>> buckets = new ArrayList<>(n);

        // Create empty buckets
        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }

        // Distribute elements into buckets
        for (double num : arr) {

            if (num < 0 || num >= 1) {
                throw new IllegalArgumentException(
                    "Values must be in the range [0, 1)"
                );
            }

            int index = (int) (num * n);

            buckets.get(index).add(num);
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets.get(i));
        }

        // Combine buckets
        int index = 0;

        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {

        double[] arr = {
            0.42, 0.32, 0.23, 0.52, 0.25, 0.47, 0.51
        };

        bucketSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}