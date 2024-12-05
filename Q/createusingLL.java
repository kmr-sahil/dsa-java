package Q;

class Queuee {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node start;
    private Node end;
    private int size;

    public Queuee() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public void push(int data) {

        if (start == null) {
            Node newNode = new Node(data);
            start = end = newNode;
        } else {

            Node newNode = new Node(data);
            end.next = newNode;
            end = end.next;
        }

        size++;

    }

    public int pop() {
        if (start == null) {
            System.out.println("empty");
            return -1;
        } else {
            int temp = start.data;
            start = start.next;
            size--;
            return temp;
        }

    }

    public int top() {
        if (start == null) {
            System.out.println("empty");
            return -1;
        } else {
            return start.data;
        }
    }

    public int size() {
        return size;
    }
}

public class createusingLL {
    public static void main(String[] args) {
        Queuee queue = new Queuee();

        // Test Case 1: Check initial size of the queue
        System.out.println("Initial size: " + queue.size()); // Expected: 0

        // Test Case 2: Pop and top from an empty queue
        System.out.println("Popped: " + queue.pop()); // Expected: empty, returns -1
        System.out.println("Current top: " + queue.top()); // Expected: empty, returns -1

        // Test Case 3: Push elements into the queue
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println("Size after pushes: " + queue.size()); // Expected: 3

        // Test Case 4: Check the top element after pushes
        System.out.println("Current top: " + queue.top()); // Expected: 10

        // Test Case 5: Pop elements and check size
        System.out.println("Popped: " + queue.pop()); // Expected: 10
        System.out.println("Popped: " + queue.pop()); // Expected: 20
        System.out.println("Size after pops: " + queue.size()); // Expected: 1

        // Test Case 6: Add more elements after popping
        queue.push(40);
        queue.push(50);
        System.out.println("Size after more pushes: " + queue.size()); // Expected: 3
        System.out.println("Current top: " + queue.top()); // Expected: 30

        // Test Case 7: Empty the queue completely
        System.out.println("Popped: " + queue.pop()); // Expected: 30
        System.out.println("Popped: " + queue.pop()); // Expected: 40
        System.out.println("Popped: " + queue.pop()); // Expected: 50
        System.out.println("Popped: " + queue.pop()); // Expected: empty, returns -1

        // Test Case 8: Check the size and top of an empty queue
        System.out.println("Final size: " + queue.size()); // Expected: 0
        System.out.println("Current top: " + queue.top()); // Expected: empty, returns -1
    }
}
