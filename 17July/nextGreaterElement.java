import java.util.* ;
import java.io.*; 

public class nextGreaterElement {
	
	public static int[] nextGreater(int[] arr, int n) {	
		int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(s.isEmpty()) res[i] = -1;
            else if(s.peek() > arr[i]) res[i] = s.peek();
            else{
                while(!s.isEmpty() && s.peek() <= arr[i]){
                    s.pop();
                }
                if(s.isEmpty()) res[i] = -1;
                else res[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return res;
	}

}
