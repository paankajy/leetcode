package december2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(!stack.isEmpty() &&
                    ((stack.peek() == '(' && c == ')') ||
                            (stack.peek() == '{' && c == '}') ||
                            (stack.peek() == '[' && c == ']')))
            {
                stack.pop();
            }
            else
                stack.push(c);
        }

        if(stack.isEmpty())
            return true;
        else
            return false;
    }



    public static void main(String[] args) {

        ValidParentheses v = new ValidParentheses();
        String s ="[(]";
        System.out.println(v.isValid(s));
        System.out.println(5/2);
    }
}
