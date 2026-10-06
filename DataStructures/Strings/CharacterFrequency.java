package DataStructures.Strings;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    static Map<Character, Integer> getFrequency(String str) {

        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {

            frequency.put(
                    ch,
                    frequency.getOrDefault(ch, 0) + 1
            );
        }

        return frequency;
    }

    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Integer> frequency =
                getFrequency(str);

        System.out.println("Character frequencies:");

        for (Map.Entry<Character, Integer> entry :
                frequency.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}
