package offer;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 */
public class Solution_25 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (node1 != null && node2 != null){
            if(node1.val < node2.val){
                tail.next = node1;
                node1 = node1.next;
                tail = tail.next;
            }else {
                tail.next = node2;
                node2 = node2.next;
                tail = tail.next;
            }
        }
        tail.next = node1 == null? node2:node1;

        return dummy.next;

    }
}
