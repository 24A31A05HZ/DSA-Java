package DataStructures.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        // Declaration and initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + arr[0]);
        System.out.println("Third element: " + arr[2]);

        // Updating an element
        arr[2] = 35;

        // Traversal using for loop
        System.out.println("\nArray elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Traversal using enhanced for loop
        System.out.println("\n\nUsing enhanced for loop:");

        for (int value : arr) {
            System.out.print(value + " ");
        }

        // Array length
        System.out.println("\n\nArray length: " + arr.length);

        // Find sum
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        System.out.println("Sum: " + sum);

    }
}
