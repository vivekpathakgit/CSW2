package assignment3;

public class A3Q01 {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int sort0sAnd1s(int arr[]) {
		int swaps = 0, j = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[j]==0) j++;
			else if(arr[i]!=1) {
				swap(arr, i, j++);
				swaps++;
			}
		}
		return swaps;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,1,1,1,0,1,0,0,1};
		int swaps = sort0sAnd1s(arr);
		System.out.println(swaps);
		for(int e : arr) 
			System.out.print(e+" ");
	}

}
