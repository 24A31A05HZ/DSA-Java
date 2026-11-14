package Algorithms.Backtracking;


public class BasicBacktracking {

    static void generateBinaryStrings(
            char[] result, int index) {

        // Base case
        if (index == result.length) {
            System.out.println(new String(result));
            return;
        }

        // Choice 1: Place 0
        result[index] = '0';
        generateBinaryStrings(result, index + 1);

        // Choice 2: Place 1
        result[index] = '1';
        generateBinaryStrings(result, index + 1);
    }

    public static void main(String[] args) {

        int n = 3;

        char[] result = new char[n];

        generateBinaryStrings(result, 0);
    }
}
