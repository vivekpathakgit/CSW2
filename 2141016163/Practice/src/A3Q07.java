package assignment3;

import java.util.Arrays;

public class A3Q07 {
	public static void reduction(int arr[]) {
		Arrays.sort(arr);
		int red = arr[0];
		int count = 1;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]-red>0) {
				System.out.println(arr.length-i);
				count+=1;
			}
		}
		System.out.println("Total number of reductions : "+ count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 1, 1, 1, 2, 3, 5};
		reduction(arr);
		
	}

}
