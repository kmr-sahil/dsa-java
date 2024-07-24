//Check if a Linked List is a palindrome

package LLQs;

public class q2 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static boolean isPalin(ListNode head){

        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the list
        ListNode middleNode = getMiddle(head);

        // Reverse the second half
        ListNode secondHalfStart = reverseList(middleNode.next);

        // Compare the first half and the reversed second half
        ListNode firstHalfStart = head;
        ListNode secondHalfIter = secondHalfStart;
        boolean isPalindrome = true;

        while (isPalindrome && secondHalfIter != null) {
            if (firstHalfStart.val != secondHalfIter.val) {
                isPalindrome = false;
            }
            System.out.println(firstHalfStart.val + " --- " + secondHalfIter.val);
            firstHalfStart = firstHalfStart.next;
            secondHalfIter = secondHalfIter.next;
        }

        // Restore the list (optional)
        middleNode.next = reverseList(secondHalfStart);

        return isPalindrome;
    }

    public static ListNode getMiddle(ListNode head){

        ListNode hare = head;
        ListNode rabbit = head;

        while ( hare.next != null && hare.next.next != null ) {
            hare = hare.next.next;
            rabbit = rabbit.next;
        }

        return rabbit;
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
        head.next = new ListNode(3);
        head.next.next = new ListNode(3);
        //head.next.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        //System.out.println(getMiddle(head).val);

        boolean isNodePalin = isPalin(head);
        System.out.println(isNodePalin + " List is Palinfrom");

    }

}
