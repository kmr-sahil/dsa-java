package LinkedList;

public class search {
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

        int ans = search(head, 30);
        System.out.println(ans);

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static int search(Node head, int x){

        Node temp = head;
        int count = 0;
        
        while(temp != null){
            if(temp.data == x){
                return count;
            }
            temp = temp.next;
            count++;
        }

        return -1;
    }
}
