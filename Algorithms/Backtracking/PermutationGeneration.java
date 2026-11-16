package Algorithms.Backtracking;
import java.util.ArrayList;
import java.util.List;

public class PermutationGeneration {

    static void generate(
            int[] arr,
            boolean[] used,
            List<Integer> current) {

        // A complete permutation is generated
        if (current.size() == arr.length) {
            System.out.println(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            // Skip already-used elements
            if (used[i]) {
                continue;
            }

            // Choose
            used[i] = true;
            current.add(arr[i]);

            // Explore
            generate(arr, used, current);

            // Unchoose
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        boolean[] used = new boolean[arr.length];

        List<Integer> current = new ArrayList<>();

        generate(arr, used, current);
    }
}
