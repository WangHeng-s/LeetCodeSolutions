package offer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
 */
public class Solution_10_2 {
    public int numWays(int n) {
        int f0 = 1;
        int f1 = 1;

        int ans;
        for(int i = 0; i < n; i++){
            ans = (f0 + f1) % 1000000007;
            f0 = f1;
            f1 = ans;
        }
        return f0;
    }
}
