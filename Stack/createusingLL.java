package Stack;

public class createusingLL {
    public static void main(String[] args) {
        Stack stack = new Stack(); // Create a new stack

        // Test cases
        System.out.println("Initial size: " + stack.size()); // Expected: 0

        stack.push(10); 
        stack.push(20); 
        stack.push(30); 

        System.out.println("Current top: " + stack.top()); 
        System.out.println("Stack size: " + stack.size()); 

        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop()); 

        System.out.println("Current top: " + stack.top()); 
        System.out.println("Stack size: " + stack.size()); 

        stack.pop(); 
        stack.pop(); 

        System.out.println("Final size: " + stack.size()); 
        System.out.println("Current top: " + stack.top()); 
    }
}