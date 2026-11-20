package Problems.Hashing;
import java.util.HashMap;

public class SubarraySumEqualsK {

    static long subarraySum(int[] arr, int k) {

        HashMap<Long, Integer> map = new HashMap<>();

        // Empty prefix sum occurs once
        map.put(0L, 1);

        long prefixSum = 0;
        long count = 0;

        for (int num : arr) {

            prefixSum += num;

            long required = prefixSum - k;

            // Count previous prefix sums that match
            count += map.getOrDefault(required, 0);

            // Store current prefix sum frequency
            map.put(
                prefixSum,
                map.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int k = 3;

        System.out.println(
            "Subarrays with sum K: "
            + subarraySum(arr, k)
        );
    }
}
