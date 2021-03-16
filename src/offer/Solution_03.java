package offer;

import java.util.HashSet;

/**
 * 找出数组中重复的数字
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class Solution_03 {
    public int findRepeatNumber(int[] nums) {
        return function01(nums);
    }

    // 方法1，遍历数组，找到重复的就返回
    private int function01(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums){
            if(!hashSet.add(num)){
                return num;
            }
        }
        return -1;
    }

    // 方法2，原地置换（题目条件：num在0~n-1范围中）
    private int function02(int[] nums){
        int temp;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}
