package assignment4;

import java.util.HashSet;

public class A4Q01 {
	public static int findRepeated(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		int res = -1;
		for(int i =0; i<arr.length; i++) {
			if(set.contains(arr[i]))
				res = arr[i];
			else 
				set.add(arr[i]);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,2,4,3};
		System.out.println(findRepeated(arr));
	}

}
