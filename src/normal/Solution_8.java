package normal;

public class Solution_8 {
    public int myAtoi(String s) {
        s = removeWhitespace(s);
        System.out.println(s);

        if(s.length() == 0) return 0;

        int len = s.length();
        int result = 0;

        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            // 以正符号开头时
            int index = 1;
            while (index < len && isNumber(s.charAt(index))){
                result = append(result, s.charAt(index), s.charAt(0));
                index++;
            }
        }else if(isNumber(s.charAt(0))){
            // 以数字开头时
            int index = 0;
            while(index < len && isNumber(s.charAt(index))){
                result = append(result, s.charAt(index), '+');
                index++;
            }
        }
        return result;
    }

    private String removeWhitespace(String s){
        int len = s.length();
        int index = 0;
        while(index < len && s.charAt(index) == ' '){
            index++;
        }
        return s.substring(index);
    }

    private boolean isNumber(char ch){
        return ch >= '0' && ch <= '9';
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
