import java.util.* ;
import java.io.*; 
public class minimumNumberOfCoinsGreedy
{
public static int findMinimumCoins(int amount){
        int[] denominations = new int[]{1000, 500, 100, 50, 20, 10, 5, 2 ,1};

        int ans = 0;
        for(int i = 0; i < 9; i++){
            if(denominations[i] <= amount){
                ans += (amount / denominations[i]);
                amount %= denominations[i];
            }
            if(amount == 0) return ans;
        }

        return ans;
    }
}
