import java.util.*;
public class maximumActivities {
    public static class Pair{
        int start;
        int end;

        public Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static int maximumActivities(List<Integer> start, List<Integer> end){
        Pair[] p = new Pair[start.size()];
        for(int i = 0; i < start.size(); ++i) p[i] = new Pair(start.get(i), end.get(i));
        Arrays.sort(p, (Pair p1, Pair p2) -> p1.end - p2.end);

        int initial = 0;
        int activities = 0;
        for(int i = 0; i < p.length; ++i){
            if(p[i].start >= initial){
                activities++;
                initial = p[i].end;
            }
        }

        return activities;
    }
}
