import java.io.*;
import java.util.* ;

public class mergeTwoSortedArray {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
			arr1[i + m] = arr2[i];
		}

		Arrays.sort(arr1);
		return arr1;
    }
}
