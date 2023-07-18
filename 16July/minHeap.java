import java.util.* ;
import java.io.*; 

public class minHeap {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        int count = 0;
        for(int[] a : q)
            if(a[0] == 1) count++;
        int[] res = new int[count];
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] a : q){
            if(a[0] == 0)
                pq.add(a[1]);
            else
                res[i++] = pq.poll();
        }

        return res;
    }
}