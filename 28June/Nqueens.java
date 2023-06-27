import java.util.*;
public class Nqueens {
    public static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public static void addOutput(boolean[][] chess){
        ArrayList<Integer> curr = new ArrayList<>();
        int n = chess.length;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                if(chess[i][j] == false) curr.add(0);
                else curr.add(1);
            }
        }
        ans.add(curr);
    }
    
    public static boolean isAttacking(boolean[][] chess, int row, int col){
        
        // top row
        for(int r = row; r >= 0; r--){
            if(chess[r][col] == true) return true;
        }
        
        // top left 
        for(int r = row, c = col; r >= 0 && c >= 0; r--, c--){
            if(chess[r][c] == true) return true;
        }
        
        for(int r = row, c = col; r >= 0 && c < chess.length; r--, c++){
            if(chess[r][c] == true) return true;
        }
        return false;
    }
    
    public static void helper(int n, int row, boolean[][] chess){
        if(row == n){
            addOutput(chess);
            return;
        }
        
        for(int i = 0; i < n; ++i){
            if(isAttacking(chess, row, i) == false){
                chess[row][i] = true;
                helper(n, row+1, chess);
                chess[row][i] = false;
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        boolean[][] chess = new boolean[n][n];
        ans = new ArrayList<>();
        helper(n, 0, chess);
        return ans;
    }
}