import java.util.*;
public class validSudoku {

	public static boolean canBeFilled(int r, int c, int[][] matrix, int k){
		for(int i = 0; i < 9; ++i){
			if(matrix[r][i] == k) return false;
			if(matrix[i][c] == k) return false;
		}

// r -> 5  || startR -> r - (r % 3) => 3
// c -> 4  || startC -> c - (c % 3) => 3
		int tr = r - (r % 3);
		int tc = c - (c % 3);
		for(int i = tr; i < tr + 3; ++i){
			for(int j = tc; j < tc + 3; ++j){
				if(matrix[i][j] == k) return false;
			}
		}

		return true;
	}
	public static boolean helper(int r, int c, int[][] matrix){

		for(int i = 0; i < matrix.length; ++i)
			for(int j = 0; j < matrix[0].length; ++j)

				if(matrix[i][j] == 0){
					for(int k = 1; k < 10; ++k)
						if(canBeFilled(i, j, matrix, k) == true){
							matrix[i][j] = k;
							if(helper(i, j, matrix) == true) return true;
							matrix[i][j] = 0;
						}
					return false;
				}

		return true;
	}

	public static boolean isItSudoku(int matrix[][]) {
		return helper(0, 0, matrix);
	}
}
