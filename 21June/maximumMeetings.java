import java.util.* ;
// import java.io.*; 
public class maximumMeetings {
    public static class pair{
        int strt;
        int last;
        int idx;

        public pair(int strt, int last, int idx){
            this.strt = strt;
            this.last = last;
            this.idx = idx;
        }
    }
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        int n = start.length;        
        pair[] duration = new pair[n];
        for(int i = 0; i < n; ++i){
            pair curr = new pair(start[i], end[i], i + 1);
            duration[i] = curr;
        }

        Arrays.sort(duration, (pair a, pair b) ->
                        (a.last != b.last) ? a.last - b.last :
                            a.idx - b.idx);

        List<Integer> ans = new ArrayList<>();

        int lastEndTime = -1;
        for(int i = 0; i < n; ++i){
            if(duration[i].strt > lastEndTime){
                ans.add(duration[i].idx);
                lastEndTime = duration[i].last;
            }
        }

        return ans;
    }
}