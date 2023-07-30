
public class longestCommonPrefix {
	public static String longestCommonPrefix(String[] arr, int n) {
		if(arr.length == 1) return arr[0];
		String ans = "";
		
		for(int x = 0; x < arr.length-1; ++x){
			String curr = arr[x];
			String next = arr[x+1];

			int i = 0;
			int j = 0;
			String currStr = "";
			while(i < curr.length() && j < next.length()){
				if(curr.charAt(i) == next.charAt(j)) currStr += curr.charAt(i);
				else break;
				i++;
				j++;
			}

			if(ans.length() == 0){
				if(currStr.length() == 0) return "";
				else ans = currStr;
			}
			else{
				i = 0;
				j = 0;
				String temp = "";
				while(i < ans.length() && j < currStr.length()){
					if(ans.charAt(i) == currStr.charAt(j)) temp += ans.charAt(i);
					else break;
					i++;
					j++;
				}
				if(temp.length() == 0) return "";
				else ans = temp;
			}
		}
		return ans;
	}

}
