import java.util.* ;
// import java.io.*; 
public class jobSequencing{
    public static int jobScheduling(int[][] jobs){
        Arrays.sort(jobs, (int[] a, int[] b)-> b[1] - a[1]);
        int maxDeadline = -1;
        for(int[] j : jobs) maxDeadline = Math.max(maxDeadline, j[0]);
        int[] vis = new int[maxDeadline];
        
        int ans = 0;
        for(int[] j : jobs){
            int i = j[0] - 1;
            while(i >= 0 && vis[i] != 0) i--;
            if(i < 0) continue;
            
            vis[i] = 1;
            ans += j[1];
        }
        return ans;
    }
}
