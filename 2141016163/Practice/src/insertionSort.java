
public class insertionSort {
	public static void inserSort(int arr[]) {
		for(int i =1; i<arr.length; i++) {
			int j = i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
				for(int e : arr)
					System.out.print(e+" ");
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,5,1,8};
		//int arr[] = {3,4,5,1,8};
		inserSort(arr);
		for(int e : arr)
			System.out.print(e+" ");
	}

}
