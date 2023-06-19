import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class rotateMatrix {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int layers = Math.min(n, m) / 2;

        while(layers > 0){
            int i = layers - 1;
            int j = layers - 1;
            
            int ru = i;
            int rd = n - i;
            int cl = j;
            int cr = m - j;

            int data = mat.get(i).get(j);
            // top row
            j++;
            while(j < cr){
                int temp = mat.get(i).get(j);
                mat.get(i).set(j, data);
                data = temp;
                j++;
            }
            // right column
            i++;
            j--;
            while(i < rd){
                int temp = mat.get(i).get(j);
                mat.get(i).set(j, data);
                data = temp;
                i++;
            }
            i--;
            j--;
            // bottom row
            while(j >= cl){
                int temp = mat.get(i).get(j);
                mat.get(i).set(j, data);
                data = temp;
                j--;
            }
            i--;
            j++;
            // left column
            while(i >= ru){
                int temp = mat.get(i).get(j);
                mat.get(i).set(j, data);
                data = temp;
                i--;
            }
            layers--;
        }
    }
}
