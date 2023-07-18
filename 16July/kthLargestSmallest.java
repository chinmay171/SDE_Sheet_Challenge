import java.util.*;


public class kthLargestSmallest {
	static int partition(int[] arr, int left, int right) {
    int pivot = arr[left] ;
    int l = left + 1 ;
    int r = right;
    while (l <= r) {
        if (arr[l] < pivot && arr[r] > pivot) {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++ ;
            r-- ;
        }
        if (arr[l] >= pivot) {
            l++;
        }
        if (arr[r] <= pivot) {
            r--;
        }
    }
    int temp2=arr[left];
            arr[left]=arr[r];
            arr[r]=temp2;
    return r;
}

	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		Collections.sort(arr);
		ArrayList<Integer> ans = new ArrayList<>(2);
		ans.add(arr.get(k-1));
		ans.add(arr.get(n-k));
		return ans;
		// // int[] arr = new int[n];
		// // for(int i = 0; i < n; ++i) arr[i] = a.get(i);
		// // int left = 0, right = arr.length - 1, kth;
		// // while (true) {
		// // 	int idx = partition(arr, left, right);
		// // 	if (idx == k - 1) {
		// // 		kth = arr[idx];
		// // 		break;
		// // 	}
		// // 	if (idx < k - 1) left = idx + 1;
		// // 	else right = idx - 1;
		// // }
		// // ans.add(kth);
		// PriorityQueue<Integer> pq = new PriorityQueue<>();
		// for(int a : arr) pq.add(a);
		

	}
}
