package offer;

import java.util.Arrays;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class Solution_07 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return function1(preorder, inorder);
    }

    // 分治法，递归实现，低效率
    // 前序遍历序列第一个一定是根结点，中序遍历在遇到根节点之前的部分是左子树，之后的部分是右子树
    // 如此，可以将子树的前序遍历和中序遍历的结果取出，得以递归实现
    // 取子树序列的过程中多次重复遍历
    private TreeNode function1(int[] preorder, int[] inorder){
        TreeNode root = null;

        int treeNodeNum = preorder.length;  // 节点数
        int rootIndex = 0;
        int leftChildNodeNum = 0;
        if(rootIndex < treeNodeNum){
            // 在中序遍历序列中，寻找当前根节点的左子树
            while(inorder[leftChildNodeNum] != preorder[rootIndex]){
                leftChildNodeNum++;
            }
            root = new TreeNode(preorder[rootIndex]);
            root.left = function1(Arrays.copyOfRange(preorder,1,leftChildNodeNum+1), Arrays.copyOfRange(inorder,0,leftChildNodeNum));
            root.right = function1(Arrays.copyOfRange(preorder,leftChildNodeNum+1,treeNodeNum), Arrays.copyOfRange(inorder,leftChildNodeNum+1,treeNodeNum));
        }
        return root;
    }

//    private TreeNode function2(int[] preorder, int[] inorder){
//
//    }
}
