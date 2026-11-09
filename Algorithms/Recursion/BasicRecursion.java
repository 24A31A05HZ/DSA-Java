public class BasicRecursion {

    // Factorial: n! = n * (n-1)!
    static int factorial(int n) {

        if (n <= 1) {
            return 1; // Base case
        }

        return n * factorial(n - 1);
    }

    // Sum of first n natural numbers
    static int sum(int n) {

        if (n == 0) {
            return 0; // Base case
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Factorial: " + factorial(5));

        System.out.println("Sum: " + sum(5));
    }
}
