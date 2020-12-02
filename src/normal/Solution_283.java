package normal;

public class Solution_283 {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0, len = nums.length;

        while(right < len){

            if(nums[right]!=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}
