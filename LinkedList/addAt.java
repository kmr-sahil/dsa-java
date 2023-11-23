package LinkedList;

public class addAt {
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

        head = addAt(head, 6, 2);

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node addAt(Node head, int val, int ind){
        Node n = new Node(val);

        Node temp = head;
        
        for(int i=0; i<ind-1; i++){
            temp = temp.next;
        }

        Node temp1= temp.next;
        temp.next = n;
        n.next = temp1;

        return head;
    }
}
