package Problems.Arrays;
import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find the next greater element
        if (i >= 0) {
            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap
            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}
