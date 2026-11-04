package Algorithms.SlidingWindow;


public class FixedSizeWindow {

    public static int maxSumSubarray(int[] arr, int k) {
        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Add the current element
            windowSum += arr[i];

            // Remove the element outside the window
            if (i >= k) {
                windowSum -= arr[i - k];
            }

            // Update result when window reaches size k
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSumSubarray(arr, k));
    }
}
