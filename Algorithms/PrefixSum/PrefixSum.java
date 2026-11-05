package Algorithms.PrefixSum;


public class PrefixSum {

    static int[] buildPrefixSum(int[] arr) {

        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    // Sum of elements from index left to right (inclusive)
    static int rangeSum(int[] prefix, int left, int right) {

        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 5, 3};

        int[] prefix = buildPrefixSum(arr);

        System.out.println("Prefix Sum:");

        for (int num : prefix) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Range Sum (1 to 3): "
                + rangeSum(prefix, 1, 3));
    }
}
