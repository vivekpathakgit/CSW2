
public class prac1 {
	static void reverse(int []arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}
	static void function(int [] arr, int k) {
		int i= 0;
		while(i+k-1<arr.length) {
			reverse(arr, i, i+k-1);
			i = i+k;
		}
		reverse(arr, i, arr.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = {1,2,3,5,4,6,9,7};
		int k= 3;
		function(in, k);
		for(int e : in) {
			System.out.print(e+" ");
		}
	}

}
