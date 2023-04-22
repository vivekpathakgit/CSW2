package assignment3;

public class A3Q04 {
//	public static int groupLarger(int arr[], int k) {
//		int swaps = 0, j = -1;
//		for(int i =0; i<arr.length; i++) {
//			if(j==-1 && arr[i]>=k) 
//				j=i;
//			if(j!=-1 && arr[i]<k) {
//				assignment3.A3Q01.swap(arr, i, j++);
//				swaps++;
//			}
//		}
//		return swaps;
//	}
	public static int selecSort(int arr[], int value) {
		int pivotIndx = -1, pivot = Integer.MAX_VALUE;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>=value && arr[i]<pivot) {
				pivot = arr[i];
				pivotIndx = i;
			}
		}
		assignment3.A3Q01.swap(arr, pivotIndx, arr.length-1);
		int swap = 0;
		for(int i =0, j = 0; i<arr.length-1; i++) {
			if(arr[i]<pivot && i!=j) {
				assignment3.A3Q01.swap(arr, i, j++);
				swap++;
			}
			else if(arr[i]<pivot && i==j)
				j++;
		}
		return swap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1,4,2,6,4,77,54,4,3};
		int arr[] = {10,7,6,8,5,9};
		int swap = selecSort(arr, 8);
		System.out.println(swap);
		for(int e : arr)
			System.out.print(e+ " ");
	}

}
