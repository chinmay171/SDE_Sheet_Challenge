import java.util.* ;
import java.io.*; 
public class sort012 
{
    public static void swap(int[] arr, int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
    public static void sort012(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = n-1;

        while(j <= k){
            if(arr[j] == 0){
                swap(arr, i, j);
                i++;
                j++;
            }else if(arr[j] == 1){
                j++;
            }else if(arr[j] == 2){
                swap(arr, j, k);
                k--;
            }
        }
    }
}