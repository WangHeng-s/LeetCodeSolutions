package normal;

public class Solution_38 {
    public String countAndSay(int n) {
        if(n == 1) return "1";

        String s = countAndSay(n-1);
        StringBuilder result = new StringBuilder();
        // 快慢双指针，从左到右寻找相同字符的组，构建s的外观数列
        int left = 0, right = 1;
        int len = s.length();
        while(right < len){
            if(s.charAt(right) != s.charAt(left)){
                result.append(right - left);
                result.append(s.charAt(left));
                left = right;
            }
            right++;
        }
        if(right == len){
            result.append(right - left);
            result.append(s.charAt(left));
        }

        return result.toString();
    }
}
