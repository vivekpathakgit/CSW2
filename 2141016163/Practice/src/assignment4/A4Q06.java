package assignment4;

import java.util.Arrays;

public class A4Q06 {
	public static void findMinMaxRange(int arr[]) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length-1];
		int indx = min;
		for(int i = 0; i<arr.length; i++) {
			while(indx<=max && arr[i]!=indx) {
				System.out.println(indx++);
			}
			indx++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,2,5,7,9};
		findMinMaxRange(arr);
	}

}
