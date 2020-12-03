package normal;

import java.util.HashMap;
import java.util.Map;

public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
//        // 双指针法
//        int left = 0, right = 0;
//        int[] result = new int[2];
//        while(left < nums.length - 1){
//            right = left + 1;
//            int temp = target - nums[left];
//            while(right < nums.length){
//                if(nums[right] == temp){
//                    result[0] = left;
//                    result[1] = right;
//                }
//                right++;
//            }
//            left++;
//        }
//        return result;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
