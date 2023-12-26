
import java.util.Collections;
import java.util.PriorityQueue;

public class creation {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(20);
         pq.add(5);
        pq.add(70);
       

        System.out.println(pq.remove());

        System.out.println(pq.peek());
    }
}
