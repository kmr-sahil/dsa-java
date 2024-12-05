package Q;

class Queue {
    private int start = -1;
    private int end = -1;
    private int[] arr;
    private int arrSize;
    private int currSize;


    public Queue(int n){
        start = -1;
        end = -1;
        arr = new int[n];
        arrSize = n;
        currSize = 0;
    }

    public void push(int x){
        if(currSize == arrSize){
            System.out.println("Full overflow");
            return;
        }

        if(currSize == 0){
            start = end = 0;
            arr[end] = x;
            currSize++;
        } else {
            end = (end + 1 ) % arrSize;
            arr[end] = x;
            currSize ++;
        }
    }

    public int pop() {
        if(currSize == 0){
            System.out.println("Empty queue");
            return Integer.MIN_VALUE;
        } 
        
        if(currSize == 1) {
            int x = arr[start];
            start = end = -1;
            currSize--;
            return x;
        } else {
            int x = arr[start];
            start = ( start + 1) % arrSize;
            currSize --;

            return x;
        }
    }

    public int top(){
        if(currSize == 0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } 
            return arr[start];
        
    }

    public int size(){
        return currSize;
    }

}



public class createUsingArray {

    public static void main(String[] args) {
        Queue queue = new Queue(5);  // Create a queue with size 5

        // Test cases
        System.out.println("Initial size: " + queue.size());  // Expected: 0
        queue.push(10);  // Expected: Pushed: 10
        queue.push(20);  // Expected: Pushed: 20
        queue.push(30);  // Expected: Pushed: 30
        queue.push(40);  // Expected: Pushed: 40
        queue.push(50);  // Expected: Pushed: 50
        queue.push(60);  // Expected: Queue Overflow

        System.out.println("1. Current top: " + queue.top());  // Expected: 10
        System.out.println("2. Queue size: " + queue.size());  // Expected: 5

        System.out.println("3. Popped: " + queue.pop());  // Expected: Popped: 10
        System.out.println("4. Popped: " + queue.pop());  // Expected: Popped: 20

        System.out.println("5. Current top: " + queue.top());  // Expected: 30
        System.out.println("6. Queue size: " + queue.size());  // Expected: 3

        queue.push(60);  // Expected: Pushed: 60
        queue.push(70);  // Expected: Pushed: 70
        queue.push(80);  // Expected: Queue Overflow

        while (queue.size() > 0) {
            System.out.println("Popped: " + queue.pop());  // Pop all elements
        }
        System.out.println("Final size: " + queue.size());  // Expected: 0
        System.out.println("Current top: " + queue.top());  // Expected: Queue is Empty
    }
    
}
