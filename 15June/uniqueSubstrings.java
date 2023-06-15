import java.util.* ;
import java.io.*; 
public class uniqueSubstrings {
	public static int uniqueSubstrings(String input){
		int j = -1;
		HashSet<Character> set = new HashSet<>();
		int ans = 0;
		for(int i = 0; i < input.length(); ++i){
			
			if(set.contains(input.charAt(i)) == true){
				// release
				while(j < i){
					j++;
					set.remove(input.charAt(j));
					if(input.charAt(i) == input.charAt(j)) break;
				}
			}
			
			//acquire
			set.add(input.charAt(i));
			ans = Math.max(ans, set.size());
		}

		return ans;
	}
}
