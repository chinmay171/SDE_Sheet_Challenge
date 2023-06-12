import java.util.* ;
import java.io.*; 
public class uniquePaths {
	public static int dp(int i, int j, int r, int c, int[][] grid){
		if(i == r-1 && j == c-1) return 1;
		if(i >= r || j >= c) return 0;
		if(grid[i][j] != -1) return grid[i][j];

		int right = dp(i, j+1, r, c, grid);
		int down = dp(i+1, j, r, c, grid);

		return grid[i][j] = (right + down);
	}
	public static int uniquePaths(int m, int n) {
		int[][] grid = new int[m][n];
		for(int i = 0; i < m; ++i)
			for(int j = 0; j < n; ++j)
				grid[i][j] = -1;
		return dp(0, 0, m, n, grid);
	}
}