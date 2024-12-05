package Stack;

public class Stack {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Added");
    }

    public int pop() {
        if (head == null) {
            System.out.println("Underflow / Empty");
            return -1;
        } else {
            int popped = head.data;
            head = head.next;
            size--;
            return popped;
        }
    }

    public int top() {
        return head == null ? -1 : head.data;
    }

    public int size() {
        return size;
    }
}