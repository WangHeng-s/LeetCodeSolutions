package normal;

public class Solution_189 {
    public void rotate(int[] nums, int k) {
        if(nums.length < 2) return;

        k %= nums.length;

        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0,k-1);
        reverseArray(nums, k, nums.length-1);
    }

    // 将数组中arr中下标left~right的部分逆序
    private void reverseArray(int[] arr, int left, int right){
        int temp;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
