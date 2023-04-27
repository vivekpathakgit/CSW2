
public class mergeSort {
	public static void merge(int arr[], int i, int mid, int j) {
		int temp[] = new int[j-i+1];
		int s1 = i, s2 = mid+1, e1 = mid, e2 = j, indx = 0;
		while(s1<=e1 && s2<=e2) {
			if(arr[s1]<arr[s2]) 
				temp[indx++] = arr[s1++];
			else 
				temp[indx++] = arr[s2++];
		}
		while(s1<=e1)
			temp[indx++] = arr[s1++];
		while(s2<=e2)
			temp[indx++] = arr[s2++];
		indx = 0;
		for(int k = i; k<=j; k++) {
			arr[k] = temp[indx++];
		}
	}
	public static void divide(int arr[], int i, int j) {
		if(i>=j) return;
			int mid = i+ (j-i)/2;
			divide(arr, i, mid);
			divide(arr, mid+1, j);
			merge(arr, i, mid, j);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,7,4,8};
		divide(arr, 0, arr.length-1);
		for(int e : arr)
			System.out.print(e+" ");
	}

}
