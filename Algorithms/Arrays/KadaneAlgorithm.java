package Algorithms.Arrays;

public class KadaneAlgorithm {

    static int maxSubarraySum(int[] arr) {

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either start a new subarray
            // or extend the current subarray
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubarraySum(arr);

        System.out.println("Maximum subarray sum: " + result);
    }
}
