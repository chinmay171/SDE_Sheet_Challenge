import java.util.* ;
import java.io.*; 
public class mColoring {

	// public static boolean helper(int src, ArrayList<Integer>[] adj, int m, int[] color){
		
	// }

	public static boolean canColor(int src, int[][] graph, int c, int[] vis){
        for(int nbr = 0; nbr < graph.length; ++nbr)
            if(graph[src][nbr] == 1 && vis[nbr] == c) return false;
        return true;
    }
    
    public static boolean dfs(int src, int[][] graph, int colors, int[] vis){
        if(src == graph.length) return true;
        for(int c = 0; c < colors; ++c){
            if(canColor(src, graph, c, vis) == true){
                vis[src] = c;
                if(dfs(src+1, graph, colors, vis) == true) return true;
                vis[src] = -1;
            }
        }
        return false;
    }

	public static String graphColoring(int[][] graph, int m) {
		// ArrayList<Integer>[] adj = new ArrayList[mat.length];
		// for(int i = 0; i < mat.length; ++i) adj[i] = new ArrayList<>();
		// for(int i = 0; i < mat.length; ++i)
		// 	for(int j = 0; j < mat.length; ++j)
		// 		if(mat[i][j] == 1)
		// 			adj[i].add(j);
		// int[] color = new int[mat.length];
		// Arrays.fill(color, -1);
		// return (helper(0, adj, m, color) == true) ? "YES" : "NO";
		int[] vis = new int[graph.length];
        Arrays.fill(vis, -1);
        return (dfs(0, graph, m, vis) == true) ? "YES" : "NO";
	}
}
