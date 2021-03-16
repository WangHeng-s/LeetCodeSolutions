package offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Solution_06 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public int[] reversePrint(ListNode head) {
        // 辅助栈
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while(node != null){
            stack.push(node);
            node = node.next;
        }
        int size = stack.size();
        int i = 0;
        int[] ans = new int[size];
        while(i<size){
            ans[i++] = stack.pop().val;
        }
        return ans;
    }

}
