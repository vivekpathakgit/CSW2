package assignment4;

import java.util.Arrays;

public class A4Q04 {
	public static int[] removeDuplicates(int[] array, int size) {
		int j = 0;
		int i;
		Arrays.sort(array);
		for (i = 1; i < size; i++) {
			if (array[i] != array[j]) {
				j++;
				array[j] = array[i];
			}
		}
		int[] ret = Arrays.copyOf(array, j + 1);
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 6, 8, 7, 6, 5, 9 };
		int arr2[] = removeDuplicates(arr, arr.length);
		for(int e : arr2)
			System.out.print(e + " ");
	}

}
