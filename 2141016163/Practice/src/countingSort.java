
public class countingSort {
	public static void countSort(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int e : arr)
			max = max < e ? e : max;
		int index[] = new int[max+1];
		for(int i =0; i<arr.length; i++)
			index[arr[i]]++;
		for(int e : index)
			System.out.print(e+" ");
		System.out.println();
		for(int i =0, j=0; i<=max; i++) {
			if(index[i]>0) {
				while(index[i]>0) {
					arr[j++] = i;
					index[i]--;
				}	
			}
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,6,4,1,5,8,1,4,6,1};
		countSort(arr);
		for(int e : arr)
			System.out.print(e+" ");
	}

}
