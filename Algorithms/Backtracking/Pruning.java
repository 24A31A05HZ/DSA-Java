package Algorithms.Backtracking;
import java.util.ArrayList;
import java.util.List;

public class Pruning {

    static void combinationSum(
            int[] arr,
            int target,
            int index,
            List<Integer> current) {

        // A valid combination is found
        if (target == 0) {
            System.out.println(new ArrayList<>(current));
            return;
        }

        // No more elements to explore
        if (index == arr.length) {
            return;
        }

        // PRUNING:
        // If current number is greater than target,
        // no need to explore this branch.
        if (arr[index] > target) {
            return;
        }

        // CHOOSE: Include current element
        current.add(arr[index]);

        // Explore: Same index allows reuse
        combinationSum(
            arr,
            target - arr[index],
            index,
            current
        );

        // UNCHOOSE
        current.remove(current.size() - 1);

        // Explore without current element
        combinationSum(
            arr,
            target,
            index + 1,
            current
        );
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};

        int target = 7;

        combinationSum(
            arr,
            target,
            0,
            new ArrayList<>()
        );
    }
}
