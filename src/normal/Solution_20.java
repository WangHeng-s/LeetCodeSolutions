package normal;

import java.util.Stack;

public class Solution_20 {
    // s是一个只包含(){}[]的字符串，判断字符串是否有效
    // 条件：1.左括号必须有对应右括号闭合
    //      2.闭合顺序必须先左后右
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        int len = s.length();
        char ch;
        for(int i=0; i<len; i++){
            ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')'){
                // 读取到')'时，如果栈空或栈顶不是'('，则不是有效的，其余两个括号类似
                if(stack.empty() || stack.pop() != '('){
                    return false;
                }
            }else if(ch == '}'){
                if(stack.empty() || stack.pop() != '{'){
                    return false;
                }
            }else if(ch == ']'){
                if(stack.empty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        // 结束时，如果不空，则不是有效的
        return stack.empty();
    }
}
