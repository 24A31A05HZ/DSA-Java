package Problems.Stack;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {

    static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove elements that cannot be the answer
            while (!stack.isEmpty() &&
                   stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Find the next greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Current element may answer earlier elements
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println(
                "Next greater: " +
                Arrays.toString(findNextGreater(arr))
        );
    }
}
