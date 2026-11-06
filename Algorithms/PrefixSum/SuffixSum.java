package Algorithms.PrefixSum;


public class SuffixSum {

    static int[] buildSuffixSum(int[] arr) {

        int n = arr.length;
        int[] suffix = new int[n];

        suffix[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        return suffix;
    }

    // Sum from index left to right (inclusive)
    static int rangeSum(int[] suffix, int left, int right) {

        if (right == suffix.length - 1) {
            return suffix[left];
        }

        return suffix[left] - suffix[right + 1];
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 5, 3};

        int[] suffix = buildSuffixSum(arr);

        System.out.println("Suffix Sum:");

        for (int num : suffix) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Range Sum (1 to 3): "
                + rangeSum(suffix, 1, 3));
    }
}
