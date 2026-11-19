package Problems.Hashing;
import java.util.*;

public class TopKFrequentElements {

    static int[] topKFrequent(int[] arr, int k) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }

        // Step 2: Create frequency buckets
        List<Integer>[] buckets = new ArrayList[arr.length + 1];

        for (int num : frequency.keySet()) {

            int freq = frequency.get(num);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        // Step 3: Collect K most frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1;
             i >= 1 && index < k; i--) {

            if (buckets[i] == null) {
                continue;
            }

            for (int num : buckets[i]) {

                result[index++] = num;

                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};

        int k = 2;

        System.out.println(
            Arrays.toString(topKFrequent(arr, k))
        );
    }
}
