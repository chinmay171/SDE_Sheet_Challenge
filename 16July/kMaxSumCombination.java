import java.util.* ;
import java.io.*; 
public class kMaxSumCombination{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Collections.sort(a);
		Collections.sort(b);
		for(int i = 0; i < a.size(); ++i)
			for(int j = 0; j < b.size(); ++j)
				pq.add(a.get(i) + b.get(j));
		
		ArrayList<Integer> ans = new ArrayList<>();
		System.out.println(pq.peek());
		int i = 0;
		while(i++ < k)
			ans.add(pq.poll());
		return ans;
	}
}