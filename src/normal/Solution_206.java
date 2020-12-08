package normal;

public class Solution_206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);

        while(head != null){
            ListNode tempNode = new ListNode(head.val);
            tempNode.next = dummy.next;
            dummy.next = tempNode;
            head = head.next;
        }

        return dummy.next;
    }
}
