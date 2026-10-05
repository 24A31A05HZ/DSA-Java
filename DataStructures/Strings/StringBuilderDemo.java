package DataStructures.Strings;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" Java");

        System.out.println("After append: " + sb);

        // Insert
        sb.insert(6, "World ");

        System.out.println("After insert: " + sb);

        // Delete
        sb.delete(6, 12);

        System.out.println("After delete: " + sb);

        // Set character
        sb.setCharAt(0, 'h');

        System.out.println("After setCharAt: " + sb);

        // Reverse
        sb.reverse();

        System.out.println("After reverse: " + sb);

        // Convert to String
        String result = sb.toString();

        System.out.println("String: " + result);

        // Length
        System.out.println("Length: " + sb.length());

        // Capacity
        System.out.println("Capacity: " + sb.capacity());
    }
}
