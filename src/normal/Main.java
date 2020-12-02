package normal;

public class Main {
    public static void main(String[] args) {
        Solution_283 solution_283 = new Solution_283();
        String s = "babad";
        int[] nums = {0,2,1};

        solution_283.moveZeroes(nums);
        for(int v :nums){
            System.out.println(v);
        }
    }
}
