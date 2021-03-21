package normal;

public class Solution_115 {
    String temp_s = null;
    String temp_t = null;
    public int numDistinct(String s, String t) {
        temp_s = s;
        temp_t = t;
        return function1(0,0);
    }

    // 回溯法暴力搜索
    private int function1(int sIndex, int tIndex){
        // 找到了一个完整的t
        if(tIndex == temp_t.length()){
            return 1;
        }
        // 已经遍历完了s
        if(sIndex == temp_s.length()){
            return 0;
        }
        // 剪枝，s中剩余的部分不足
        if(temp_t.length() - tIndex > temp_s.length() - sIndex){
            return 0;
        }

        int count = 0;
        while(sIndex < temp_s.length()){
            if(temp_s.charAt(sIndex) == temp_t.charAt(tIndex)){
                count += function1(sIndex+1, tIndex+1);
            }
            sIndex++;
        }
        return count;
    }

    // 动态规划
    private int function2(String s, String t){
        int m = s.length();
        int n = t.length();
        if(m < n){
            return 0;
        }
        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i <= m; i++){
            dp[i][n] = 1;
        }

        for(int i = m - 1; i >= 0; i--){
            char sChar = s.charAt(i);
            for(int j = n - 1; j >= 0; j--){
                char tChar = t.charAt(j);
                if(sChar == tChar){
                    dp[i][j] = dp[i+1][j+1] + dp[i+1][j];
                }else {
                    dp[i][j] = dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
}
