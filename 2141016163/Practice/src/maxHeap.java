
public class maxHeap {
	public static void swap(int arr[], int j, int k) {
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}
	public static void MaxHeapify(int[]arr, int i,int e) {
		int left = 2*i<=e ? arr[2*i-1] : -1;
		int right = 2*i+1<=e ? arr[2*i] : -1;
		if(left<right && arr[i-1]<right) {
			swap(arr, i-1, 2*i);
			if(2*i+1<=e/2)
				MaxHeapify(arr, 2*i+1,e);
		}
		else if(left>right && arr[i-1]<left) {
			swap(arr, i-1, 2*i-1);
			if(2*i<=e/2)
				MaxHeapify(arr, 2*i,e);
		}
			
	}
	public static void buildMaxHeap(int []arr, int e) {
		for(int i = e/2; i>=1; i--)
			MaxHeapify(arr, i,e);
	}
	public static int deleteInMaxHeap(int[]arr, int e) {
		swap(arr, e-1, 0);
		buildMaxHeap(arr, e-1);
		return e-1;
	}
	public static int heapSort(int[]arr, int e) {
		while(e>=1) {
			e = deleteInMaxHeap(arr, e);
		}
		return e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,30,8,10,16,50,20,60};
		int end = arr.length;
		buildMaxHeap(arr,end);
		for(int  e : arr)
			System.out.print(e+" ");
		end = heapSort(arr,end);
		System.out.println();
		for(int  e : arr)
			System.out.print(e+" ");
	}

}
