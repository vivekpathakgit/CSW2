package assignment3;

import java.util.HashMap;

public class A3Q05 {
	public static void sortSameOrder(int arr1[], int arr2[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<arr1.length; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i],0 )+1);
		}
		for(int i =0; i<arr2.length; i++) {
			while(map.containsKey(arr2[i])) {
				System.out.print(arr2[i]+" ");
				map.put(arr2[i], map.get(arr2[i])-1);
				if(map.get(arr2[i])==0)
					map.remove(arr2[i]);
			}
		}
		for(int i=0; i<arr1.length; i++) {
			while(map.containsKey(arr1[i])) {
				System.out.print(arr1[i]+" ");
				map.put(arr1[i], map.get(arr1[i])-1);
				if(map.get(arr1[i])==0)
					map.remove(arr1[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr1[] = {1,3,2,5,3,9,7,8};
//		int arr2[] = {2, 3, 1};
		int arr1[] = {2,1,2,5,7,1,9,3,6,8,8};
		int arr2[] = {2,1,8,3};
		sortSameOrder(arr1, arr2);
		
	}

}
