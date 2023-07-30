public class longestPalindromeSubstring {	
	public static String longestPalinSubstring(String str) {
		// Write your code here.
		if(str.length() == 1) return str;
        int maxLen = 0;
		int start = 0, end = 0;
		
		for(int i = 0; i < str.length(); ++i){
			// odd
			int len1 = 0;
			int l = i, r = i;
			while(l >= 0 && r < str.length()){
				if(str.charAt(l) == str.charAt(r)){
					len1 += (l == r) ? 1 : 2;
					l--;
					r++;
				}else break;
			}
			if(maxLen < len1){
				maxLen = len1;
				start = l + 1;
				end = r - 1;
			}
			
			// even 
			int len2 = 0;
			l = i;
			r = i+1;
			while(l >= 0 && r < str.length()){
				if(str.charAt(l) == str.charAt(r)){
					len2 += 2;
					l--;
					r++;
				}else break;
			}
			if(maxLen < len2){
				maxLen = len2;
				start = l + 1;
				end = r - 1;
			}
		}
		// System.out.println(start + " " + maxLen);
		return str.substring(start, end+1);
	}
}
