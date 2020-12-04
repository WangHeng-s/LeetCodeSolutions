package normal;

public class Solution_125 {
    public boolean isPalindrome(String s) {
        // 头尾双指针法
        int left = 0, right = s.length() - 1;
        while(left < right){
            while (left < right && isNotValid(s.charAt(left))) left++;
            while (left < right && isNotValid(s.charAt(right))) right--;
            if(!isTheSame(s.charAt(left), s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isNotValid(char ch){
        return (ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z') && (ch < '0' || ch > '9');
    }

    private boolean isTheSame(char a, char b){
        if(a >= '0' && a <= '9' && a != b){
            return false;
        }
        return a == b || a == b + 32 || a == b - 32;
    }
}
