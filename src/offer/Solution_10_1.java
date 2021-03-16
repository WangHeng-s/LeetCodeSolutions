package offer;

/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
 */
public class Solution_10_1 {
    public int fib(int n) {
        // 前两项
        int f0 = 0;
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
