package normal;

public class Solution_48 {
    public void rotate(int[][] matrix) {
        // 先转置矩阵，再将每一行逆序
        int len = matrix[0].length;
        int temp;

        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                if(i != j){
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        int left,right;
        for(int i = 0; i < len; i++){
            left = 0;
            right = len - 1;
            while(left < right){
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
