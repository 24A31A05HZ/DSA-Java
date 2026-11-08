package Algorithms.PrefixSum;
import java.util.HashMap;

public class PrefixSumWithHashMap {

    static int countSubarraysWithSumK(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Empty prefix has sum 0 and occurs once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {

            prefixSum += num;

            // Find earlier prefix sums that create sum K
            int required = prefixSum - k;

            count += map.getOrDefault(required, 0);

            // Store frequency of current prefix sum
            map.put(
                prefixSum,
                map.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -2, 2};

        int k = 3;

        System.out.println(
                "Number of Subarrays: "
                + countSubarraysWithSumK(arr, k)
        );
    }
}
