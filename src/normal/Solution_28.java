package normal;

public class Solution_28 {
    public int strStr(String haystack, String needle) {
        int i;
        if(needle.length() == 0){
            return 0;
        }
        for(i = 0; i < haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i) == needle.charAt(0) && haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
