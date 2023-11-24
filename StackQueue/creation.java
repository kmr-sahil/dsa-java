package StackQueue;

import java.util.Stack;

public class creation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);

        System.out.println(st.peek());

        System.out.println(st.pop());

        System.out.println(st.peek());

        System.out.println(st.size());
    }
}
