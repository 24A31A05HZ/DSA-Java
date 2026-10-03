package DataStructures.Arrays;

public class ArrayOperations {

    // Print array
    static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    // Search for an element
    static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Find sum
    static int sum(int[] arr) {

        int total = 0;

        for (int value : arr) {
            total += value;
        }

        return total;
    }

    // Find maximum
    static int maximum(int[] arr) {

        int max = arr[0];

        for (int value : arr) {

            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    // Find minimum
    static int minimum(int[] arr) {

        int min = arr[0];

        for (int value : arr) {

            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    // Count occurrences of an element
    static int countOccurrences(int[] arr, int target) {

        int count = 0;

        for (int value : arr) {

            if (value == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20};

        System.out.print("Array: ");
        printArray(arr);

        int target = 20;

        System.out.println("Index of " + target + ": "
                + search(arr, target));

        System.out.println("Sum: " + sum(arr));

        System.out.println("Maximum: " + maximum(arr));

        System.out.println("Minimum: " + minimum(arr));

        System.out.println("Occurrences of " + target + ": "
                + countOccurrences(arr, target));
    }
}
