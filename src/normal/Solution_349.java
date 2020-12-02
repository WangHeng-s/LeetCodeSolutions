package normal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet1 = new HashSet<Integer>();
        Set<Integer> hashSet2 = new HashSet<Integer>();

        for(int value : nums1){
            hashSet1.add(value);
        }
        for(int value : nums2){
            hashSet2.add(value);
        }

        return getIntersection(hashSet1, hashSet2);
    }

    private int[] getIntersection(Set<Integer> nums1, Set<Integer> nums2){
        if(nums1.size() > nums2.size()){
            return getIntersection(nums2, nums1);
        }

        Set<Integer> temp = new HashSet<Integer>();

        for(int value : nums1){
            if(nums2.contains(value)){
                temp.add(value);
            }
        }

        int[] result = new int[temp.size()];
        int index = 0;
        for(int value : temp){
            result[index++] = value;
        }

        return result;
    }
}
