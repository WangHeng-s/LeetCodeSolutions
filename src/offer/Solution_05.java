package offer;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Solution_05 {
    public String replaceSpace(String s) {
        return function1(s);
    }

    private String function1(String s){
        int len = s.length();
        char[] arr = new char[len * 3];
        int i = 0;
        int size = 0;

        while(i < len){
            char ch = s.charAt(i);
            if(ch == ' '){
                arr[size++] = '%';
                arr[size++] = '2';
                arr[size++] = '0';
            }else{
                arr[size++] = ch;
            }
            i++;
        }
        return new String(arr, 0, size);
    }
}
