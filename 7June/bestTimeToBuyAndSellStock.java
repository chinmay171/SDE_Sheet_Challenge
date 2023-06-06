import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class bestTimeToBuyAndSellStock{
    public static int maximumProfit(ArrayList<Integer> prices){
        int min = Integer.MAX_VALUE;
        int ans = 0;
        
        for(int i = 0; i < prices.size(); ++i){
            min = Math.min(min, prices.get(i));
            ans = Math.max(ans, prices.get(i) - min);
        }

        return ans;
    }
}