public class RecursionTree {

    static void printTree(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("Entering: " + n);

        printTree(n - 1);
        printTree(n - 1);

        System.out.println("Exiting: " + n);
    }

    public static void main(String[] args) {

        printTree(3);
    }
}
