import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Stack;

public class onlineStockSpan {
    public static class Pair{
        int val;
        int index;
        Pair(int val, int index){
            this.val = val;
            this.index = index;
        }
    }
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        Stack<Pair> stk = new Stack<>();

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < price.size(); ++i){
            while(stk.size() > 0 && stk.peek().val <= price.get(i))
                stk.pop();

            if(stk.size() == 0) ans.add(i+1);
            else ans.add(i - stk.peek().index);
            stk.push(new Pair(price.get(i), i));
        }

        return ans;
    }
}