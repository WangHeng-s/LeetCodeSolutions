package normal;

public class Solution_24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            // 空或者只有一个时直接返回
            return head;
        }
        ListNode result = new ListNode();

        // 交换前两个相邻结点
        result.next = head;
        result.next = head.next;
        head.next = head.next.next;
        result.next.next = head;
        // 递归调用
        result.next.next.next = swapPairs(result.next.next.next);

//        result.next = head;
//        ListNode node1 = result;
//        ListNode node2 = head;
//        while(node2.next != null){
//            node1.next = node2.next;
//            node2.next = node2.next.next;
//            node1.next.next = node2;
//            if(node2.next == null || node2.next.next == null){
//                break;
//            }
//            node1 = node1.next.next;
//            node2 = node2.next;
//        }


        return result.next;
    }
}
