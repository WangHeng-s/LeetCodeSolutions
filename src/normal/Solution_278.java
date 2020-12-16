package normal;

public class Solution_278 {
    // 一个接口
    boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {
        // 二分查找
        int left = 1, right = n;
        while(left < right){
            int version = left + (right - left) / 2; // 防止整数溢出时出错
            if(isBadVersion(version)){
                right = version;
            }else{
                left = version + 1;
            }
        }
        return left;
    }
}
