package normal;

import java.util.Deque;
import java.util.LinkedList;

public class Solution_98 {
     static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
    public boolean isValidBST(TreeNode root) {
        // 中序遍历
//        Deque<TreeNode> stack = new LinkedList<>();
//        double inorder = -Double.MAX_VALUE;
//
//        while(!stack.isEmpty() || root != null){
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            if (root.val <= inorder) {
//                return false;
//            }
//            inorder = root.val;
//            root = root.right;
//        }
//        return true;
        // 递归
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer lower, Integer upper){
         if(root == null) return true;

         if(lower != null && root.val <= lower){
             return false;
         }
         if(upper != null && root.val >= upper){
             return false;
         }

         if(!helper(root.left, lower, root.val)){
             return false;
         }
         if(!helper(root.right, root.val, upper)){
             return false;
         }
         return true;
    }

}
