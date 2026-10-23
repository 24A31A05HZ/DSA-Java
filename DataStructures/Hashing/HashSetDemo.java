package DataStructures.Hashing;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored

        System.out.println("HashSet: " + set);
        System.out.println("Contains 20: " + set.contains(20));

        set.remove(10);

        System.out.println("After removal: " + set);
        System.out.println("Size: " + set.size());

        // Iterate through elements
        for (int value : set) {
            System.out.println(value);
        }
    }
}
