
public class A1Q17BinarySearch {
	public static int binarySearch(int []arr, int i, int j, int key) {
		if(i>j) {
			return -1;
		}
		int mid = i + (j-i)/2;
		if(arr[mid]==key) return mid;
		else if(arr[mid]<key)
			return binarySearch(arr, mid+1, j, key);
		else
			return binarySearch(arr, i, mid-1, key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,33};
		System.out.println(binarySearch(arr, 0, arr.length-1, 33));
	}

}
