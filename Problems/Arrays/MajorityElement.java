package Problems.Arrays;


public class MajorityElement {
    public static int findMajority(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(
                "Array must not be empty"
            );
        }

        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify that the candidate is a true majority.
        count = 0;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        throw new IllegalArgumentException(
            "No majority element exists"
        );
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        System.out.println(findMajority(arr));
    }
}
