package Stack;

import java.util.Stack;

public class infixtoprefix {

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPrefix(String s) {
        // Reverse the input string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversed = sb.toString();

        // Swap '(' with ')' and vice versa
        StringBuilder processed = new StringBuilder();
        for (char c : reversed.toCharArray()) {
            if (c == '(') {
                processed.append(')');
            } else if (c == ')') {
                processed.append('(');
            } else {
                processed.append(c);
            }
        }

        // Convert the modified infix to postfix
        String modifiedInfix = processed.toString();
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < modifiedInfix.length(); i++) {
            char c = modifiedInfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                ans.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    ans.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        // Reverse the result to get prefix notation
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        infixtoprefix converter = new infixtoprefix();

        // Test cases
        String[] testCases = {
            "a+b*(c^d-e)^(f+g*h)-i",
            "A*B+C/D",
            "(A-B/C)*(A/K-L)",
            "x+y*z/w+u"
        };

        System.out.println("Infix to Prefix Conversion:");
        for (String testCase : testCases) {
            System.out.println("Infix: " + testCase);
            System.out.println("Prefix: " + converter.infixToPrefix(testCase));
            System.out.println();
        }
    }
}
