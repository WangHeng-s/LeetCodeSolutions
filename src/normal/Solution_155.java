package normal;

import java.util.Stack;

public class Solution_155 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a, b;
        for(String token : tokens){
            if(isNumber(token)){
                stack.push(Integer.parseInt(token));
            }else{
                b = stack.pop();
                a = stack.pop();
                switch (token){
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }
    private boolean isNumber(String s){
        return !(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"));
    }
}
