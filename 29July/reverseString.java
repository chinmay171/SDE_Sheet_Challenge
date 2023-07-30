import java.util.*;
public class reverseString {
	public static String reverseString(String str) {
		String ans = "";
		String curr = "";
		for(int i = str.length()-1; i >= 0; i--){
			char ch = str.charAt(i);
			if(ch == ' ' && curr == "") continue;
			if(ch == ' '){
				ans += curr + " ";
				curr = "";
				continue;
			} 
			curr = ch + curr;
		}
		if(curr != "") ans += curr + " ";
		return ans;
		// String [] words = str.trim().split(" +");
		// Collections.reverse(Arrays.asList(words));
		// return String.join(" ", words);
	}
}
