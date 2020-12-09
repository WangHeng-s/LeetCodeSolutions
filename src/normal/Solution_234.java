package normal;

import java.util.ArrayList;
import java.util.List;

public class Solution_234 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();

        ListNode node = head;
        while(node != null){
            nums.add(node.val);
            node = node.next;
        }

        int left = 0, right = nums.size() - 1;
        while(left < right){
            if (!nums.get(left).equals(nums.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
