package normal;

public class Solution_53 {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxSub = nums[0];
        int tempSub = nums[0];

        for(int i = 1; i < nums.length; i++){
            tempSub = Math.max(tempSub + nums[i], nums[i]);
            if(tempSub > maxSub){
                maxSub = tempSub;
            }
        }

        return maxSub;
    }
}
