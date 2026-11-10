public class TailRecursion {

    // Tail-recursive sum
    static int sum(int n, int accumulator) {

        if (n == 0) {
            return accumulator;
        }

        return sum(n - 1, accumulator + n);
    }

    // Tail-recursive factorial
    static int factorial(int n, int accumulator) {

        if (n <= 1) {
            return accumulator;
        }

        return factorial(n - 1, accumulator * n);
    }

    public static void main(String[] args) {

        System.out.println("Sum: " + sum(5, 0));

        System.out.println("Factorial: "
                + factorial(5, 1));
    }
}
