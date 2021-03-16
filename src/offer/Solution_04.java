package offer;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class Solution_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        return function1(matrix, target);
    }

    // 方法一，从矩阵右上角开始，按二叉树搜索
    private boolean function1(int[][] matrix, int target){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int n = matrix.length;                  // 行数
        int m = matrix[0].length;               // 列数

        int i = 0;
        int j = m - 1;

        while(i < n && j >= 0){
            if(target == matrix[i][j]){
                return true;
            }else if(target > matrix[i][j]){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}
