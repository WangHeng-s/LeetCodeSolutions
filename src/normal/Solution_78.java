package normal;

import java.util.ArrayList;
import java.util.List;

public class Solution_78 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return ans;
    }


    private void dfs(int[] nums, int cur){
        if(cur == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // 选择cur进入temp
        temp.add(nums[cur]);
        dfs(nums, cur + 1);
        temp.remove(temp.size() - 1);

        dfs(nums, cur + 1);
    }
}
