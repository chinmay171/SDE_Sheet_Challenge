import java.util.* ;
import java.io.*; 

public class kadaneAlgo {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long currSum = 0;
		long maxSum = 0;
		for(int i = 0; i < n; ++i){
			if(currSum + (long)arr[i] > arr[i]) currSum += arr[i];
			else currSum = (long)arr[i];
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}

}
