package normal;

import java.util.HashMap;
import java.util.Map;

public class Solution_387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(hashMap.containsKey(c)){
                hashMap.put(c, len);
            }else{
                hashMap.put(c, i);
            }
        }
//        int minIndex = len;
//        for(int v : hashMap.values()){
//            if(v < minIndex){
//                minIndex = v;
//            }
//        }
//        if(minIndex == len){
//            return -1;
//        }
//        return minIndex;

        for(int i = 0; i < len; i++){
            if(hashMap.get(s.charAt(i)) != len){
                return i;
            }
        }
        return -1;
    }
}
