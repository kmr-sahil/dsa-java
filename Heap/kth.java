
import java.util.Collections;
import java.util.PriorityQueue;

public class kth {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //PriorityQueue<Integer> pq = new PriorityQueue<>();

        int arr[] = {2,5,8,9,13,7};
        int k = 3;

        int i= 0;

        while(i < k) {
            pq.add(arr[i]);
            i++;
        }

        while(i < arr.length){

            if(pq.peek() < arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
             i++;
        }

        i = 0;

        while(i < k) {
            System.out.println(pq.remove());
            i++;
        }

    }
}
