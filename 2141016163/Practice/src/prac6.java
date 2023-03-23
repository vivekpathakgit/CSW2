
public class prac6 {
	public static int missing(int[]arr) {
		int sum = 0, n = arr.length+1;
		for(int e : arr) {
			sum+= e;
		}
		return (n*(n+1)/2)-sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,6,7,8};
		System.out.println(missing(arr));
	}

}
