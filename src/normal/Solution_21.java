package normal;

public class Solution_21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode();
        ListNode result = tempNode;

        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                tempNode.next = new ListNode(l2.val);
                tempNode = tempNode.next;
                l2 = l2.next;
            }else{
                tempNode.next = new ListNode(l1.val);
                tempNode = tempNode.next;
                l1 = l1.next;
            }
        }
        if(l1 == null){
            tempNode.next = l2;
        }else{
            tempNode.next = l1;
        }

        return result.next;
    }
}
