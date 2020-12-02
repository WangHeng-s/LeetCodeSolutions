package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_15 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;

        if(len<3){
            return result;
        }

        // 先对数组进行排序
        Arrays.sort(nums);

        for(int i=0;i<len-2;i++){
            if(i == 0 || nums[i] != nums[i-1]){
                int start = i + 1;
                int end = len - 1;
                while(start < end){
                    if(nums[i] + nums[start] + nums[end] == 0){
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        start++;
                        end--;
                        while(start<end && nums[start] == nums[start-1]){
                            start++;
                        }
                        while(start<end && nums[end] == nums[end+1]){
                            end--;
                        }
                    }else if(nums[i] + nums[start] + nums[end] >0){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }

        return result;
    }
}
