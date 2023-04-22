package assignment3;

public class A3Q02 {
	public static int sort(int arr[]) {
		int swaps = 0, j = -1;
		for(int i =0; i<arr.length; i++) {
			if(j==-1 && arr[i]==2) 
				j=i;
			if(j!=-1 && arr[i]!=2) {
				assignment3.A3Q01.swap(arr, i, j++);
				swaps++;
			}
		}
		int k = j;
		j = -1;
		for(int i =0; i<k; i++) {
			if(j==-1 && arr[i]==1) 
				j=i;
			if(j!=-1 && arr[i]!=1) {
				assignment3.A3Q01.swap(arr, i, j++);
				swaps++;
			}
		}
		return swaps;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,0,0,2,2,1,1,0,0,2};
		int swap = sort(arr);
		System.out.println(swap);
		for(int e : arr)
			System.out.print(e+" ");
	}

}
