package assignment3;

import java.util.Arrays;

public class A3Q08 {
	public static void merge(int []arr1, int arr2[]) {
		int indx = 0; 
		while(indx<arr1.length) {
			if(arr1[indx]<arr2[0]) {
				indx++;
			}
			else {
				int temp = arr1[indx];
				arr1[indx] = arr2[0];
				arr2[0] = temp;
				Arrays.sort(arr2);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, 9, 10, 15, 20 };
		int arr2[] = { 2, 3, 8, 13 };
		merge(arr, arr2);
		for(int e : arr)
			System.out.print(e + " ");
		System.out.println();
		for(int e : arr2)
			System.out.print(e+ " ");
	}

}
