package offer;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class Solution_21 {
    public int[] exchange(int[] nums) {
        // 双指针
        int[] ans = new int[nums.length];
        int left = 0, right = nums.length-1;
        for(int i : nums){
            if(i%2 == 0){
                ans[right--] = i;
            }else{
                ans[left++] = i;
            }
        }
        return ans;
    }
}
