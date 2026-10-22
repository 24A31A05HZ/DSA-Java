package DataStructures.Hashing;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insert key-value pairs
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        // Display the map
        System.out.println("HashMap: " + map);

        // Access a value
        System.out.println("Student 102: " + map.get(102));

        // Update a value
        map.put(102, "David");

        // Check whether a key exists
        System.out.println("Contains key 101: " + map.containsKey(101));

        // Iterate through entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Remove an entry
        map.remove(103);

        System.out.println("Size: " + map.size());
        System.out.println("Final HashMap: " + map);
    }
}

