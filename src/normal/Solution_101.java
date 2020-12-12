package normal;

public class Solution_101 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }

    private boolean helper(TreeNode node1, TreeNode node2){
        if(node1 != null && node2 != null){
            return node1.val == node2.val && helper(node1.left, node2.right) && helper(node1.right, node2.left);
        }
        if(node1 == null && node2 == null){
            return true;
        }
        return false;
    }
}
