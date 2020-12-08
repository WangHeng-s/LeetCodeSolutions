package normal;

public class Solution_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        String s = strs[0];
        int len = s.length();
        int count = strs.length;
        for(int i = 0; i < len; i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < count; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != ch){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
