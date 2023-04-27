import java.util.Arrays;

public class prac4 {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}



	public static void rearg(int[] arr) {
//		Arrays.sort(arr);
//		for(int i = 0; i+2<arr.length; i+=2) {
//			int temp = arr[i+1];
//			arr[i+1] = arr[i+2];
//			arr[i+2] = temp;
//		}
		int size = arr.length;
		/* Odd elements are lesser then even elements. */
		for (int i = 1; i < size; i += 2) {
			if ((i - 1) >= 0 && arr[i] > arr[i - 1]) {
				swap(arr, i, i - 1);
			}
			if ((i + 1) < size && arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 4, 2, 14, 33, 5 };
		rearg(a);
		for (int e : a)
			System.out.print(e + " ");
	}

}
