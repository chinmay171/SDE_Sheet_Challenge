import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class pascalTriangle {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
		for(int i = 0; i < n; ++i){
			ArrayList<Long> curr = new ArrayList<>();
			for(int j = 0; j <= i; ++j){
				if(j == 0 || j == i) curr.add(1L);
				else curr.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
			}
			ans.add(curr);
		}
		return ans;
	}
}
