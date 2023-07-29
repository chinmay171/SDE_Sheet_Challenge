import java.util.* ;
import java.io.*; 
/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
	
public class celebrityProblem {
	public static int findCelebrity(int n) {
        // Write your code here.
		Stack<Integer> stk = new Stack<>();

		for(int i = 0; i < n; ++i)
			stk.push(i);

		while(stk.size() > 1){
			int a = stk.pop();
			int b = stk.pop();

			if(Runner.knows(a, b) == true && Runner.knows(b, a) == true)
				continue;
			if(Runner.knows(a, b) == true)
				stk.push(b);
			if(Runner.knows(b, a) == true)
				stk.push(a);
		}

		if(stk.size() == 0) return -1;
		
		int possible = stk.pop();
		for(int i = 0;i < n; ++i){
			if(i == possible) continue;
			if(Runner.knows(i, possible) != true || Runner.knows(possible, i) != false)
				return -1;
		}
		return possible;
    }
}