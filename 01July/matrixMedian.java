import java.util.ArrayList;

public class matrixMedian{

	public static int getCount(ArrayList<Integer> curr, int x){
		int low = 0;
		int high = curr.size() - 1;

		while(low <= high){
			int mid = (low + high) / 2;
			if(curr.get(mid) <= x) low = mid + 1;
			else high = mid - 1;
		}
		return low;
	}

	public static int countSmallerNo(ArrayList<ArrayList<Integer>> matrix, int x){
		int count = 0;
		for(int i = 0; i < matrix.size(); ++i){
			ArrayList<Integer> curr = matrix.get(i);
			count += getCount(curr, x);
		}
		return count;
	}
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix){
		int low = 1;
		int high = (int)(1e5);

		int medianIdx = ((matrix.size() * matrix.get(0).size() / 2 ));
		while(low <= high){
			int mid = (low + high) / 2;
			int countSmaller = countSmallerNo(matrix, mid);

			if(countSmaller <= medianIdx) low = mid + 1;
			else high = mid - 1;
		}

		return low;
	}
}