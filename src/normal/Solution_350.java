package normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] result = new int[nums1.length];
        int index = 0;
        for(int value : nums1){
            hashMap.put(value, hashMap.getOrDefault(value, 0)+1);
        }
        for(int value :nums2){
            if(hashMap.containsKey(value) && hashMap.get(value) != 0){
                result[index++] = value;
                hashMap.put(value, hashMap.get(value)-1);
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
