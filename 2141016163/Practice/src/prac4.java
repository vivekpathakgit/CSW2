import java.util.Arrays;

public class prac4 {
	public static void rearg(int []arr) {
		Arrays.sort(arr);
		for(int i = 0; i+2<arr.length; i+=2) {
			int temp = arr[i+1];
			arr[i+1] = arr[i+2];
			arr[i+2] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,4,2,14,33,5};
		rearg(a);
		for(int e : a) System.out.print(e+" ");
	}

}
