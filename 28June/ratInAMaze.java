import java.util.* ;
import java.io.*; 
public class ratInAMaze {
    public static ArrayList<ArrayList<Integer>> ans;
    public static int[][] dir = {{-1, 0}, {0, +1}, {+1, 0}, {0, -1}};
    public static void helper(int r, int c, int[][] maze, int[][] vis){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<Integer> curr = new ArrayList<>();
            vis[r][c] = 1;
            for(int i = 0; i < vis.length; ++i)
                for(int j = 0; j < vis[0].length; ++j)
                    curr.add(vis[i][j]);
            ans.add(new ArrayList<>(curr));
            vis[r][c] = 0;
            return;
        }

        for(int i = 0; i < 4; ++i){
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];

            if(nr < 0 || nr >= maze.length || nc < 0 || nc >= maze[0].length)
                continue;
            if(maze[nr][nc] == 0) continue;
            if(vis[nr][nc] != 0) continue;
            
            vis[r][c] = 1;
            helper(nr, nc, maze, vis);
            vis[r][c] = 0;
        }
    }
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        ans = new ArrayList<>();
        if(maze[0][0] == 0) return ans;
        int[][] vis = new int[n][n];
        helper(0, 0, maze, vis);
        return ans;
    }
}