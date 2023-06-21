import java.util.*;
public class minimumPlatforms {
    public static class pair{
        int arrTime;
        int depTime;

        public pair(int arrTime, int depTime){
            this.arrTime = arrTime;
            this.depTime = depTime;
        }
    }
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pair[] atdt = new pair[n];
        for(int i = 0; i < n; ++i){
            pair curr = new pair(at[i], dt[i]);
            atdt[i] = curr;
        }

        Arrays.sort(atdt, (pair a, pair b) ->
                        a.arrTime - b.arrTime);

        int platforms = 0;
        for(int i = 0; i < n; ++i){
            if(pq.size() == 0){
                pq.add(atdt[i].depTime);
            }else{
                while(pq.size() > 0 && pq.peek() < atdt[i].arrTime) pq.remove();
                pq.add(atdt[i].depTime);
            }
            platforms = Math.max(platforms, pq.size());
        }

        return platforms;
    }
}