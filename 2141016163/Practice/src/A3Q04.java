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
		int i = 0, j = arr.length-1, swaps = 0; 
		while(i<j) {
			while(i<j && arr[i]<value)
				i++;
			while(i<j && arr[j]>=value)
				j--;
			if(i<j) {
				assignment3.A3Q01.swap(arr, i++, j--);
				swaps++;
			}
		}
		return swaps;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,10,6,8,10};
//		int arr[] = {10,6,7,5,8,9};
		int swap = selecSort(arr, 8);
		System.out.println(swap);
		for(int e : arr)
			System.out.print(e+ " ");
	}

}
