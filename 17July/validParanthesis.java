import java.util.*;
public class validParanthesis {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
                stk.push(ch);
            else{
                if(stk.size() == 0) return false;
                char top = stk.pop();
                if((ch == '}' && top == '{')||
                   (ch == ']' && top == '[')||
                   (ch == ')' && top == '(')) continue;
                else return false;
            }
        }
        return true;
    }
}