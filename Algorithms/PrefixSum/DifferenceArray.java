package Algorithms.PrefixSum;


public class DifferenceArray {

    static int[] buildDifferenceArray(int[] arr) {

        int n = arr.length;
        int[] diff = new int[n];

        diff[0] = arr[0];

        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        return diff;
    }

    // Add value to every element in range [left, right]
    static void rangeUpdate(
            int[] diff, int left, int right, int value) {

        diff[left] += value;

        if (right + 1 < diff.length) {
            diff[right + 1] -= value;
        }
    }

    static int[] buildFinalArray(int[] diff) {

        int n = diff.length;
        int[] result = new int[n];

        result[0] = diff[0];

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 0};

        int[] diff = buildDifferenceArray(arr);

        rangeUpdate(diff, 1, 3, 5);
        rangeUpdate(diff, 2, 4, 2);

        int[] result = buildFinalArray(diff);

        System.out.println("Final Array:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
