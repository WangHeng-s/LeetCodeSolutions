package normal;

public class Solution_7 {
    public int reverse(int x){
        int result = 0;
        while(x != 0){
            int n = x % 10;

            // 溢出判断
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && n > Integer.MAX_VALUE % 10)){
                return 0;
            }
            if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && n < Integer.MIN_VALUE % 10)){
                return 0;
            }
            result = result * 10 + n;
            x /= 10;
        }
        return result;
    }
}
