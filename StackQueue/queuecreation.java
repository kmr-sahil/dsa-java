package StackQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class queuecreation {
    public static void main(String[] args) {
        Queue<Integer> st = new ArrayDeque<>();

        st.offer(10);
        st.offer(20);
        st.offer(30);
        
        System.out.println(st.peek());

        System.out.println(st.remove());
        System.out.println(st.remove());

        System.out.println(st.peek());
    }
}
