package StackQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reversetillK {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        queue.offer(70);

        reverse(queue, 3);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

    public static void reverse(Queue<Integer> queue, int k){

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < k; i++){
            st.add(queue.remove());
        }

        for(int i = 0; i < k; i++){
            queue.offer(st.pop());
        }

        int n = queue.size() - k;

        for(int i = 0; i < n; i++){
            queue.offer(queue.remove());
        }

        //System.out.println("queue after adding elements:");
        //for (Integer element : queue) {
        //    System.out.println(element);
        //}


    }
}
