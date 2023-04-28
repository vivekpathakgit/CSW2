package assignment3;

public class rough {
	public static boolean func(int arr[], int size) {
		int start = -1;
		int stop = -1;
		for (int i = 0; i < (size - 1); i++) {
			if (arr[i] > arr[i + 1]) {
				start = i;
				break;
			}
		}
		if (start == -1)
			return true;
		for (int i = start; i < (size - 1); i++) {
			if (arr[i] < arr[i + 1]) {
				stop = i;
				break;
			}
		}
		if (stop == -1)
			return true;
		// increasing property
		// after reversal the sub array should fit in the array.
		if (arr[start - 1] > arr[stop] || arr[stop + 1] < arr[start])
			return false;
		for (int i = stop + 1; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4,6, 8,7,6,5,9 };
		System.out.println(func(arr, arr.length));
	}

}
