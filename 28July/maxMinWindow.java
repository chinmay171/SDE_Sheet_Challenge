import java.util.* ;
import java.io.*; 
public class maxMinWindow {
    static class Pair{
        int value;
        int index;
        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
    public static int[] maxMinWindow(int[] a, int n) {
        // Write your code here
        // int[] smallerL = new int[n];
        // Stack<Pair> stk1 = new Stack<>();
        // for(int i = n-1; i >= 0; i--){
        //     while(stk1.size() > 0 && stk1.peek().value >= arr[i])
        //         stk1.pop();
        //     if(stk1.size() == 0) smallerL[i] = n;
        //     else smallerL[i] = stk1.peek().index;
            
        //     stk1.push(new Pair(arr[i], i));
        // }
        
        // int[] smallerR = new int[n];
        // Stack<Pair> stk2 = new Stack<>();
        // for(int i = 0; i < n; ++i){
        //     while(stk2.size() > 0  && stk2.peek().value >= arr[i])
        //         stk2.pop();
        //     if(stk2.size() == 0) smallerR[i] = -1;
        //     else smallerR[i] = stk2.peek().index;
            
        //     stk2.push(new Pair(arr[i], i));
        // }
        
        // int[] ans = new int[n];
        // Arrays.fill(ans, -1);
        // for(int i = 0; i < n; ++i){
        //     int winSize = smallerL[i] - smallerR[i] - 1;
        //     ans[winSize - 1] = Math.max(arr[i], ans[winSize - 1]);
        // }
        // for(int i = n-2; i >= 0; i--)
        //     if(ans[i] < ans[i+1]) ans[i] = ans[i+1];
        
        // return ans;
        int[] left=new int[n];
        int[] right=new int[n];   
        int[] ans = new int[n]; 
        for(int i = 0;i<n;i++){
            ans[i] = Integer.MIN_VALUE;
        }
        Stack<Integer> st=new Stack<>();
        left[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++) {
            while(!st.empty() && a[st.peek()]>=a[i]) {
                st.pop();
            }
            left[i]=st.empty()?-1:st.peek();
            st.push(i);
        }
        while(!st.empty()) {
            st.pop();
        }
        right[n-1]=n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--) {
            while(!st.empty() && a[st.peek()]>=a[i]) {
                st.pop();
            }
            right[i]=st.empty()?n:st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++) {
            int len=right[i]-left[i]-1;
            ans[len-1]=Math.max(ans[len-1],a[i]);
        }
        for(int i=n-2;i>=0;i--) {
            ans[i]=Math.max(ans[i],ans[i+1]);
        }
        return ans;
    }
}

