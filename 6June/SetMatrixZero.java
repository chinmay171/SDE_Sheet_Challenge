import java.io.*;
import java.util.* ;

public class SetMatrixZero {
    public static void setZeros(int matrix[][]) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for(int i = 0; i < matrix.length; ++i)
            for(int j = 0; j < matrix[0].length; ++j)
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
        for(int i = 0; i < matrix.length; ++i)
            for(int j = 0; j < matrix[0].length; ++j)
                if(rows.contains(i) == true || cols.contains(j) == true)
                    matrix[i][j] = 0;
    }

}