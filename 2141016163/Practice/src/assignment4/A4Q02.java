package assignment4;

import java.util.HashSet;

public class A4Q02 {
	public static void printDuplicate(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i]))
				System.out.println(arr[i]);
			else
				set.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,2,3,4,5,3};
		printDuplicate(arr);
		
	}

}
