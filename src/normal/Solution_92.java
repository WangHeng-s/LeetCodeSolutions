package normal;


public class Solution_92 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        for(int i = 0; i < left - 1; i++){
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next = null;
        for(int i = 0; i < right-left; i++){
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummy.next;
    }
}
