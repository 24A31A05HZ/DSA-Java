package Problems.Hashing;
import java.util.HashMap;

public class FirstUniqueCharacter {

    static int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count character frequencies
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(
                ch,
                map.getOrDefault(ch, 0) + 1
            );
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";

        int result = firstUniqChar(s);

        System.out.println(
            "First Unique Character Index: " + result
        );
    }
}
