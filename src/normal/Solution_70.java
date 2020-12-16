package normal;

public class Solution_70 {
    public int climbStairs(int n) {
        // 登上第i个台阶的方法数 = 登上第i-1个台阶的方法数 + 登上第i-2个台阶的方法数

        // 递归实现，会超时
//        if(n <= 1) return 1;
//        return climbStairs(n-1) + climbStairs(n - 2);
        // 迭代实现
        // p是登上第i-2个台阶的方法数，q是登上第i-1个台阶的方法数
        int p = 0, q = 0, r = 1;
        for(int i = 1; i <= n; i++){
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
