//Find the nth node from the end & remove it.

package LLQs;

public class q1 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeNth(ListNode head, int n) {

        ListNode currNode = head;
        if (currNode == null) {
            return null;
        }

        // cal size
        int size = 0;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }

        int deleNodeIndex = size - n -1;
        int currIndex = 0;
        ListNode prevNode = head;

        while (currIndex != deleNodeIndex) {
            prevNode = prevNode.next;
            currIndex++;
        }

        prevNode.next = prevNode.next.next;

        return head;

    }

    public static void print(ListNode head) {
        ListNode currNode = head;

        while (currNode != null) {
            System.out.println(currNode.val);
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(80);

        print(head);

        removeNth(head, 3);

        System.out.println("----");

        print(head);

    }

}
