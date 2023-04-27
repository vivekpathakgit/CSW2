
public class bubbleSort {
	public static void swap(int arr[], int j, int k) {
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}
	public static void bubleSort(int arr[]) {
		for(int i =0; i<arr.length; i++) {
			for(int j = 1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1])
					swap(arr, j, j-1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,99,1,44};
		bubleSort(arr);
		for(int e : arr)
			System.out.print(e+" ");
	}

}
