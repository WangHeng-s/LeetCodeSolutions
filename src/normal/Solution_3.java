package normal;

import java.util.HashSet;

/*
* 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
* 思路是依次找出所有子串，每一个子串与当前的最大长度比较，维护最大长度的值
* */
public class Solution_3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int i = 0, j = 0, maxLength = 0;

        if(s.length()==0){
            return 0;
        }
        // 将子串表示为从j到i
        // 如果set中没有i处的字符，则加入并更新最大长度
        // 如果有，则本子串结束，开始寻找下一个子串——将产生冲突的字符及其之前的字符从set中移出
        // 循环上面两步，直到所有子串被遍历，返回maxLength
        for(;i<s.length();i++){
            char temp = s.charAt(i);
            if(!set.contains(temp)){
                set.add(temp);
                maxLength = Math.max(maxLength, set.size());
            }else{
                while(set.contains(temp)){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(temp);
            }
        }

        return maxLength;
    }
}
