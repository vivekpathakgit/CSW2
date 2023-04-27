import java.util.Scanner;

public class book1_33 {
	public static void swap(int []arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void sort(int []arr) {
		Scanner sc =new Scanner(System.in);
		for(int i =0; i<arr.length; i++) {
			while(arr[i]!=-1 && arr[i]!=i) {
				swap(arr, i, arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,-1,-1};
		sort(arr);
		for(int e : arr) System.out.println(e);
	}

}
