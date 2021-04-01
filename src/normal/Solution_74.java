package normal;

public class Solution_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;         // 行数
        int n = matrix[0].length;      // 列数

        int head = 0, tail = m * n - 1;    // 值 表征的是矩阵从上到下从左到右的第（值）个元素
        int mid;
        while(head <= tail){
            mid = (tail - head) / 2 + head;
            int rowIndex = mid / n;
            int colIndex = mid % n;
            if(matrix[rowIndex][colIndex] == target){
                return true;
            }else if(matrix[rowIndex][colIndex] > target){
                tail = mid - 1;
            }else{
                head = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] m = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int t = 13;
        System.out.println(searchMatrix(m, t));
    }
}
