public class ReverseNumber {

    static int reverse(int n, int result) {
        if (n == 0) {
            return result;
        }

        return reverse(n / 10, result * 10 + n % 10);
    }

    public static void main(String[] args) {
        int n = 1234;

        System.out.println("Reversed: " + reverse(n, 0));
    }
}