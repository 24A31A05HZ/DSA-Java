package Algorithms.SlidingWindow;


import java.util.HashMap;

public class SlidingWindowWithHashMap {

    public static int longestUniqueSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // If character was previously seen,
            // move left beyond its previous occurrence
            if (map.containsKey(current)) {
                left = Math.max(
                    left,
                    map.get(current) + 1
                );
            }

            // Store the latest index
            map.put(current, right);

            // Update maximum length
            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(longestUniqueSubstring(s));
    }
}
