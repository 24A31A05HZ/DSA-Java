package Algorithms.Backtracking;
import java.util.ArrayList;
import java.util.List;

public class ChooseExploreUnchoose {

    static void generateSubsets(
            int[] arr,
            int index,
            List<Integer> current) {

        // Base case
        if (index == arr.length) {
            System.out.println(new ArrayList<>(current));
            return;
        }

        // 1. CHOOSE: Include current element
        current.add(arr[index]);

        // 2. EXPLORE: Move to next element
        generateSubsets(arr, index + 1, current);

        // 3. UNCHOOSE: Remove current element
        current.remove(current.size() - 1);

        // Explore without current element
        generateSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        List<Integer> current = new ArrayList<>();

        generateSubsets(arr, 0, current);
    }
}
