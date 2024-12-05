package Stack;

import java.util.Stack;

public class postfixtoprefix {

    public String postfixToPrefix(String s){
        //int i = s.length()-1;

        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){

            String c = s.substring(i, i + 1);
            if(Character.isLetterOrDigit(c.charAt(0))){
                stack.push(c);
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();

                String newS = c + t2 + t1 ;
                stack.push(newS);
            }
            
            
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        postfixtoprefix converter = new postfixtoprefix();

        // Test case 1: Simple Expression
        String test1 = "ab+";
        System.out.println("Postfix: " + test1 + " -> Prefix: " + converter.postfixToPrefix(test1));

        // Test case 2: Complex Expression
        String test2 = "abc*+";
        System.out.println("Postfix: " + test2 + " -> Prefix: " + converter.postfixToPrefix(test2));

        // Test case 3: Multiple Operators
        String test3 = "ab+c*d-";
        System.out.println("Postfix: " + test3 + " -> Prefix: " + converter.postfixToPrefix(test3));
    }
}
