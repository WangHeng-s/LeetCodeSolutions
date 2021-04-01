package normal;

import java.util.Stack;

public class Solution_9 {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int temp = 0;
        while(temp < x){
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        return temp == x || temp/10 == x;
    }
}
