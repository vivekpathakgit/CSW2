
public class prac7 {
	public static void arrng(int[] arr) {
		int sizeNew = 0;
		for (int i = 0, j = -1; i < arr.length; i++) {
			if (arr[i] == 2 && j == -1)
				j = i;
			else if (arr[i] != 2 && j != -1) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j++] = temp;
			}
			sizeNew = j;
		}

		for (int i = 0, j = -1; i < sizeNew; i++) {
			if (arr[i] == 1 && j == -1)
				j = i;
			else if (arr[i] != 1 && j != -1) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j++] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 0, 2, 0, 0, 2, 2 };
		arrng(arr);
		for (int e : arr)
			System.out.print(e + " ");
	}

}
