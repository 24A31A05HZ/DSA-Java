package Problems.Arrays;

public class RotateArray {

    // Reverse elements from left to right
    static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Rotate array to the right by k positions
    static void rotateRight(int[] arr, int k) {

        int n = arr.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        // Reverse entire array
        reverse(arr, 0, n - 1);

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

        System.out.print("Original array: ");
        printArray(arr);

        rotateRight(arr, k);

        System.out.print("After right rotation by " + k + ": ");
        printArray(arr);
    }
}
