package Stack;
import java.util.Stack;

public class postfixtoinfix {

    public String postFixToInfix(String s){

        Stack<String> stack = new Stack<>();
        
        for(int i=0; i < s.length(); i++){

            String c = s.substring(i, i + 1);

            if(Character.isLetterOrDigit(c.charAt(0))){
                stack.push(c);
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();

                String newS = "(" + t2 + c + t1 + ")";
                stack.push(newS);
            }

        }

        return stack.pop();
    }

    public static void main(String[] args) {
        postfixtoinfix converter = new postfixtoinfix();

        // Test case 1: Simple Expression
        String test1 = "ab+";
        System.out.println("Postfix: " + test1 + " -> Infix: " + converter.postFixToInfix(test1));

        // Test case 2: Complex Expression
        String test2 = "abc*+";
        System.out.println("Postfix: " + test2 + " -> Infix: " + converter.postFixToInfix(test2));

        // Test case 3: Multiple Operators
        String test3 = "ab+c*d-";
        System.out.println("Postfix: " + test3 + " -> Infix: " + converter.postFixToInfix(test3));
    }
    
}
