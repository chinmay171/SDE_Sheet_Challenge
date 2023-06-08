import java.util.* ;
import java.io.*; 
// /*******************************************************

    // Following is the Interval class structure

    // class Interval {
    //     int start, int finish;

    //     Interval(int start, int finish) {
    //         this.start = start;
    //         this.finish = finish;
    //     }
    // }
    
// *******************************************************/

import java.util.List;
import java.util.ArrayList;

public class mergeIntervals {
    class Interval {
        int start;
        int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        Arrays.sort(intervals, (Interval a, Interval b) ->
                                a.start - b.start);
        List<Interval> ans = new ArrayList<>();
        int start = intervals[0].start;
        int end = intervals[0].finish;
        for(int i = 1; i < intervals.length; i++){
            while(i < intervals.length && intervals[i].start <= end){
                end = Math.max(intervals[i].finish, end);
                i++;
            }
            Interval curr = new Interval(start, end);
            ans.add(curr);
            if(i < intervals.length){
                start = intervals[i].start;
                end = intervals[i].finish;
            }else{
                start = -1;
                end = -1;
            }
        }
        if(start != -1){
            Interval f = new Interval(start, end);
            ans.add(f);
        }
        return ans;
    }
}
