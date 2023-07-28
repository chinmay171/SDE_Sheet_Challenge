import java.util.*;

public class largetHistogram {
  public static class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
      this.val = val;
      this.idx = idx;
    }
  }
  public static int largestRectangle(ArrayList<Integer> heights){
      int n = heights.size();
      Pair[] p = new Pair[n];

      for(int i = 0; i < n; ++i)
        p[i] = new Pair(heights.get(i), i);

      int[] next = new int[n];
      Stack<Pair> stk1 = new Stack<>();
      for(int i = n-1; i >= 0; --i){
        int curr = p[i].val;
        while(stk1.size() > 0 && stk1.peek().val >= curr)
          stk1.pop();
        if(stk1.size() == 0) next[i] = n-1;
        else next[i] = stk1.peek().idx - 1;

        stk1.push(p[i]);
      }

      int[] prev = new int[n];
      Stack<Pair> stk2 = new Stack<>();
      for(int i = 0; i < n; ++i){
        int curr = p[i].val;
        while(stk2.size() > 0 && stk2.peek().val >= curr)
          stk2.pop();
        if(stk2.size() == 0) prev[i] = 0;
        else prev[i] = stk2.peek().idx + 1;

        stk2.push(p[i]);
      }

      int ans = 0;
      for(int i = 0; i < n; ++i){
        int range = next[i] - prev[i] + 1;
        ans = Math.max(ans, heights.get(i) * range);
      }
      return ans;
  }
}