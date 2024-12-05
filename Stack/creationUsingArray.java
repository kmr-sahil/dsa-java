package Stack;

class Stacks {
    private int top = -1;
    private int[] arr;
    private int arrSize;

    public Stacks(int n) {
        top = -1;
        arr = new int[n];
        arrSize = n;
    }

    public Stacks() {
        this(10); // Default constructor with a default stack size of 10
    }

    public void push(int x) {
        if (top == arrSize - 1) {
            System.out.println("Overflow no space");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return Integer.MIN_VALUE;
        } else {
            int x = arr[top];
            top--;
            return x;
        }
    }

    public int top() {
        if (top == -1) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else {
            return arr[top];
        }
    }

    public int size() {
        if (top == -1) {
            return 0;
        } else {
            return top + 1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class creationUsingArray {
    public boolean isValid(String s) {
        Stacks st = new Stacks();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            // Push opening brackets
            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } else {
                // If closing bracket and stack is empty, return false
                if (st.isEmpty()) return false;
                
                char top = (char) st.pop();
                
                // Check for matching brackets
                if ((current == ')' && top != '(') ||
                    (current == '}' && top != '{') ||
                    (current == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // Stack should be empty for valid parentheses
        return st.isEmpty();
    }

    public static void main(String[] args) {
        creationUsingArray solution = new creationUsingArray();
        
        // Test Case 1: Balanced parentheses
        System.out.println("Test Case 1: " + solution.isValid("()"));        // Expected: true
        
        // Test Case 2: Nested balanced parentheses
        System.out.println("Test Case 2: " + solution.isValid("()[]{}"));    // Expected: true
        
        // Test Case 3: Unbalanced parentheses
        System.out.println("Test Case 3: " + solution.isValid("(]"));        // Expected: false
        
        // Test Case 4: Mismatched closing
        System.out.println("Test Case 4: " + solution.isValid("([)]"));      // Expected: false
        
        // Test Case 5: Incomplete opening
        System.out.println("Test Case 5: " + solution.isValid("("));         // Expected: false
        
        // Test Case 6: Empty string
        System.out.println("Test Case 6: " + solution.isValid(""));          // Expected: true
    }
}