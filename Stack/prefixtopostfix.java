package Stack;

import java.util.Stack;

public class prefixtopostfix {
    
    public String preFixToPostfix(String s){
        int i = s.length()-1;

        Stack<String> stack = new Stack<>();

        while(i >= 0){

            String c = s.substring(i, i + 1);
            if(Character.isLetterOrDigit(c.charAt(0))){
                stack.push(c);
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();

                String newS =  t1 + t2 + c ;
                stack.push(newS);
            }
            i--;
            
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        prefixtopostfix converter = new prefixtopostfix();

        // Test case 1: Simple Expression
        String test1 = "+ab";
        System.out.println("Prefix: " + test1 + " -> Infix: " + converter.preFixToPostfix(test1));

        // Test case 2: Complex Expression
        String test2 = "+a*bc";
        System.out.println("Prefix: " + test2 + " -> Infix: " + converter.preFixToPostfix(test2));

        // Test case 3: Multiple Operators
        String test3 = "-*+abcd";
        System.out.println("Prefix: " + test3 + " -> Infix: " + converter.preFixToPostfix(test3));
    }
}