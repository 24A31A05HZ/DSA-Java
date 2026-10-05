package DataStructures.Strings;

public class StringBasics {

    public static void main(String[] args) {

        // Creating strings
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length
        System.out.println("\nLength: " + str1.length());

        // Access character
        System.out.println("First character: " + str1.charAt(0));

        // Traversal
        System.out.println("\nCharacters:");

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }

        // Concatenation
        String combined = str1 + " " + str2;

        System.out.println("\n\nCombined: " + combined);

        // Comparison
        String a = "Java";
        String b = "Java";

        System.out.println("\na.equals(b): " + a.equals(b));
        System.out.println("a == b: " + (a == b));

        // Case-insensitive comparison
        System.out.println(
                "Java equals JAVA: "
                        + a.equalsIgnoreCase("JAVA")
        );

        // Substring
        String text = "Programming";

        System.out.println("\nSubstring: " + text.substring(0, 7));

        // Searching
        System.out.println(
                "Index of 'gram': " + text.indexOf("gram")
        );

        System.out.println(
                "Contains 'gram': " + text.contains("gram")
        );

        // Starts and ends with
        System.out.println(
                "Starts with 'Pro': " + text.startsWith("Pro")
        );

        System.out.println(
                "Ends with 'ing': " + text.endsWith("ing")
        );

        // Replace
        String replaced = text.replace("Programming", "Java");

        System.out.println("Replaced: " + replaced);

        // Convert case
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // Remove leading/trailing spaces
        String spaced = "   Hello Java   ";

        System.out.println("Trimmed: '" + spaced.trim() + "'");
    }
}
