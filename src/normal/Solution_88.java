package normal;

import java.util.Arrays;

public class Solution_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        System.arraycopy(nums1,0, temp, 0, m);

        int p1 = 0, p2 = 0;
        int index = 0;
        while(p1 < m && p2 < n){
            if(temp[p1] < nums2[p2]){
                nums1[index++] = temp[p1++];
            }else{
                nums1[index++] = nums2[p2++];
            }
        }
        if(p1 == m){
            System.arraycopy(nums2, p2, nums1, index, m + n - index);
        }
        if(p2 == n){
            System.arraycopy(temp, p1, nums1, index, m + n - index);
        }
    }
}
