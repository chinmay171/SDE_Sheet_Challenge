import java.util.* ;
import java.io.*; 
// /****************************************************************

//     Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
// *****************************************************************/


public class fractionalKnapsack {

	public static class modPair{
		double ratio;
		int weight;
		int value;

		public modPair(double ratio, int value, int weight){
			this.ratio = ratio;
			this.value = value;
			this.weight = weight;
		}
	}
    public static double maximumValue(Pair[] items, int n, int w) {
        modPair[] mPair = new modPair[n];
		for(int i = 0; i < n; i++){
			double r = (double)items[i].value / (double)items[i].weight;
			mPair[i] = new modPair(r, items[i].value, items[i].weight);
		}

		Arrays.sort(mPair, (modPair a, modPair b) ->
							(b.ratio > a.ratio) ? 1 :
								(a.ratio > b.ratio) ? -1 :
									0);

		int i = 0;
		double ans = 0;
		while(i < n && w > 0){
			if(mPair[i].weight <= w){
				w -= mPair[i].weight;
				ans += (double)mPair[i].value;
			}else{
				ans += (double)(w * mPair[i].ratio);
				w = 0;
			}
			i++;
		}

		return ans;
    }
}
