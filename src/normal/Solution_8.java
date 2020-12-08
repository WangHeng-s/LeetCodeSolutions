package normal;

public class Solution_8 {
    public int myAtoi(String s) {
        s = s.trim();

        if(s.length() == 0) return 0;

        int len = s.length();
        int result = 0;

        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            // 以正符号开头时
            int index = 1;
            while (index < len && Character.isDigit(s.charAt(index))){
                result = append(result, s.charAt(index), s.charAt(0));
                index++;
            }
        }else if(Character.isDigit(s.charAt(0))){
            // 以数字开头时
            int index = 0;
            while(index < len && Character.isDigit(s.charAt(index))){
                result = append(result, s.charAt(index), '+');
                index++;
            }
        }
        return result;
    }

    // 进行溢出判断，将ch接在num后面
    private int append(int num, char ch, char sign){
        int temp;
        if(sign == '+'){
            // 正溢出判断
            temp = ch - '0';
            if(num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)){
                return Integer.MAX_VALUE;
            }
        }else{
            // 负溢出判断
            temp = '0' - ch;
            if(num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && temp < Integer.MIN_VALUE % 10)){
                return Integer.MIN_VALUE;
            }
        }
        return num * 10 + temp;
    }
}
