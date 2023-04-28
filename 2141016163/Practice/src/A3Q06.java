package assignment3;

public class A3Q06 {
	public static void oddEven(int arr[]) {
		int i = 0, j = arr.length-1; 
		while(i<j) {
			while(i<j && arr[i]%2==0)
				i++;
			while(i<j && arr[j]%2!=0)
				j--;
			if(i<j) {
				assignment3.A3Q01.swap(arr, i, j);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {3,4,2,7,5,4};
		int arr[] = {3,4,2,7,5,4};
		oddEven(arr);
		for(int e : arr)
			System.out.print(e+" ");
	}

}
