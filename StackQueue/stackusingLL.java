package StackQueue;

import java.util.LinkedList;

public class stackusingLL {
    public static void main(String[] args) {
        LinkedList<Integer> st = new LinkedList<>();

        st.addFirst(10);
        st.addFirst(20);
        st.addFirst(30);
        st.addFirst(40);

        System.out.println(st.removeFirst());
        System.out.println(st.removeFirst());
        System.out.println("peek - " + st.peek());
        System.out.println(st.removeFirst());
    }
}
