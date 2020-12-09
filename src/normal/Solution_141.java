package normal;


import java.util.HashSet;
import java.util.Set;

public class Solution_141 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        // 哈希表法
//        Set<ListNode> hashSet = new HashSet<>();
//        ListNode node = head;
//        while(node != null){
//            if(!hashSet.add(node)){
//                return true;
//            }
//            node = node.next;
//        }
//        return false;

        // 快慢双指针法
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
