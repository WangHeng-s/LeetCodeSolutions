package normal;

public class Solution_5 {
    private int start;
    private int maxLength;
    private String s;
    public String longestPalindrome(String s){
        if(s.length()<2){
            return s;
        }

        start = 0;
        maxLength = 1;
        this.s = s;

        for(int i=0;i<s.length();i++){
            expandAroundCenter(i-1,i+1);
            expandAroundCenter(i,i+1);
        }

        return s.substring(start,start+maxLength);
    }

    private void expandAroundCenter(int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            if(right-left+1 > maxLength){
                maxLength = right-left+1;
                start = left;
            }
            left--;
            right++;
        }
    }
}
