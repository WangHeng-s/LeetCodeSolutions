package normal;

public class Solution_66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        while(n >= 0){
            digits[n]++;
            digits[n] = digits[n] % 10;
            if(digits[n] != 0){
                return digits;
            }
            n--;
        }
        int[] result = new int[digits.length + 1];
        int index = 1;
        result[0] = 1;
        for(int value : digits){
            result[index++] = value;
        }
        return result;
    }
}
