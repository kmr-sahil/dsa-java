package LinkedList;

public class mid {
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
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        

        Node head = n1;

        int ans = mid(head);
        System.out.println(ans);

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static int mid(Node head){
        
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s.data;
    }
}
