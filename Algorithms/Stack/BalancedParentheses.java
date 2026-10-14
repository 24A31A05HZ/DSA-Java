package Algorithms.Stack;


import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {

    static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if (ch == ')' && open != '(' ||
                    ch == ']' && open != '[' ||
                    ch == '}' && open != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";

        System.out.println("Expression: " + str);
        System.out.println("Balanced: " + isBalanced(str));
    }
}

