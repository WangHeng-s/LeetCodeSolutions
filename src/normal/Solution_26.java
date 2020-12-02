package normal;

public class Solution_26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;

        int left = 0, right = 1;
        for(; right < nums.length; right++){
            if(nums[left] != nums[right]){
                nums[left+1] = nums[right];
                left++;
            }
        }
        return left+1;
    }
}
