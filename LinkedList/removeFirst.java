package LinkedList;

public class removeFirst {
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

        head = removeFirst(head);

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node removeFirst(Node head){
        
        if( head == null){
            return null;
        }
        head = head.next;

        return head;
    }
}
