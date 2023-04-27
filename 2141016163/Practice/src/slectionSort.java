
public class slectionSort {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void selecSort(int arr[]) {
		for(int i =0; i<arr.length; i++) {
			int min = Integer.MAX_VALUE, minIndx = -1;
			for(int j = 0+i; j<arr.length; j++) {
				if(arr[j]<min) {
					minIndx = j;
					min = arr[j];
				}
			}
			swap(arr, i, minIndx);
			for(int e : arr)
				System.out.print(e+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,5,1,8};
		selecSort(arr);
		for(int e : arr) 
			System.out.print(e+" ");
	}

}
