package Algorithms.SlidingWindow;


public class VariableSizeWindow {

    public static int minSubarrayLength(int target, int[] arr) {
        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            // Expand window
            windowSum += arr[right];

            // Shrink window while condition is satisfied
            while (windowSum >= target) {

                minLength = Math.min(
                    minLength,
                    right - left + 1
                );

                windowSum -= arr[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(minSubarrayLength(target, arr));
    }
}
