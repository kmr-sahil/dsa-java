package StackQueue;

import java.util.LinkedList;

public class queueusingLL {
    public static void main(String[] args) {
        LinkedList<Integer> st = new LinkedList<>();

        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);

        System.out.println("Queue after adding elements:");
        for (Integer element : st) {
            System.out.println(element);
        }

        System.out.println("----");

        System.out.println(st.removeFirst());
        System.out.println(st.removeFirst());
        System.out.println("peek - " + st.peek());
        System.out.println(st.removeFirst());
    }
}
