package normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

//        // 使用HashMap，速度慢，消耗内存多
//        Map<Character, Integer> hashMap1 = new HashMap<Character, Integer>();
//        Map<Character, Integer> hashMap2 = new HashMap<Character, Integer>();
//
//        for(char c : s.toCharArray()){
//            hashMap1.put(c, hashMap1.getOrDefault(c, 0) + 1);
//        }
//        for(char c : t.toCharArray()){
//            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
//        }
//        for(char c : t.toCharArray()){
//            if(!hashMap1.getOrDefault(c, 0).equals(hashMap2.get(c))){
//                return false;
//            }
//        }
//        return true;

        // 排序法
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
