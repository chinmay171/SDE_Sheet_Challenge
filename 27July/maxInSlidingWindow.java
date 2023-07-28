import java.util.* ;

public class maxInSlidingWindow{
	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k){
		Deque<Integer> q = new ArrayDeque<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 0; i < nums.size(); ++i){
			if(q.size() > 0 && q.getFirst() <= i - k)
				q.removeFirst();
			while(q.size() > 0 && nums.get(i) >= nums.get(q.getLast()) )
				q.removeLast();
			q.addLast(i);
			
			if(i >= k-1) ans.add(nums.get(q.getFirst()));
		}
		return ans;
	}
}