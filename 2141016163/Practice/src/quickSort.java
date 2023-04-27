
public class quickSort {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void quickSort(int arr[], int s, int e) {
		if(s>=e) return ;
		int pivot = e, i = s;
		for(int k = s; k<pivot; k++) {
			if(arr[k]<arr[pivot])
				swap(arr, k, i++);
		}
		swap(arr, pivot, i);
		quickSort(arr, s, i-1);
		quickSort(arr, i+1, e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 1,5, 2, 3, 9};
		quickSort(arr, 0, arr.length-1);
		for(int e : arr)
			System.out.print(e+" ");
	}

}
