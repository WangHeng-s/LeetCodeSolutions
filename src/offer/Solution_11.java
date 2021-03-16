package offer;

public class Solution_11 {
    public int minArray(int[] numbers) {
        if(numbers.length == 1) return numbers[0];
        int n = numbers.length - 1;

        while(n > 0 && numbers[n] > numbers[n-1]){
            n--;
        }
        return numbers[n];
    }
}
