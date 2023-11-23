package LinkedList;

public class last {
    public static class Node {
        int data;
        Node next;

        Node(int val){
            this.data = val;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        Node head = n1;

        head = addlast(head, 6);

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node addlast(Node head, int val){
        Node n = new Node(val);

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = n;
        n.next = null;

        return head;
    }
}
