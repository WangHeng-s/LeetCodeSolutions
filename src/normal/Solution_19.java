package normal;

public class Solution_19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        // 将n2往后移n位，然后再将n1,n2同时后移，直到n2到达尾部，此时n1就是倒数第n+1个结点
        ListNode n1 = dummy;
        ListNode n2 = dummy;
        for(int i=0; i<n; i++){
            n2 = n2.next;
        }
        while(n2.next != null){
            n1 = n1.next;
            n2 = n2.next;
        }
        n1.next = n1.next.next;

        return dummy.next;
    }
}
