import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class mergeKsortedArrays {
	public static class Pair{
		int ele;
		int arrayNo;
		Pair(int ele, int arrayNo){
			this.ele = ele;
			this.arrayNo = arrayNo;
		}
	}
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k){
		PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.ele - p2.ele);
		int[] idxNo = new int[k];
		ArrayList<Integer> ans = new ArrayList<>();

		for(int i = 0; i < kArrays.size(); ++i)
			pq.add(new Pair(kArrays.get(i).get(0), i));
		while(pq.size() > 0){
			Pair front = pq.remove();
			// addition into answer
			ans.add(front.ele);
			// addition of new pair in pq
			idxNo[front.arrayNo]++;
			if(idxNo[front.arrayNo] >= kArrays.get(front.arrayNo).size()) continue;
			pq.add(new Pair(kArrays.get(front.arrayNo).get(idxNo[front.arrayNo]), front.arrayNo));
		}
		return ans;
	}
}
