public class RecursionWithArrays {

    // Print array elements
    static void printArray(int[] arr, int index) {

        if (index == arr.length) {
            return;
        }

        System.out.print(arr[index] + " ");

        printArray(arr, index + 1);
    }

    // Find maximum element
    static int findMax(int[] arr, int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }

        int max = findMax(arr, index + 1);

        return Math.max(arr[index], max);
    }

    // Check whether array is sorted
    static boolean isSorted(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }

    // Linear search using recursion
    static int search(int[] arr, int index, int target) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return search(arr, index + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Array: ");
        printArray(arr, 0);

        System.out.println();

        System.out.println("Maximum: "
                + findMax(arr, 0));

        System.out.println("Is Sorted: "
                + isSorted(arr, 0));

        System.out.println("Search 30: "
                + search(arr, 0, 30));
    }
}
