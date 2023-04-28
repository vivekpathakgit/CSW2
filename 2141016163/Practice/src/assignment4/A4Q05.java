package assignment4;

public class A4Q05 {
	public static int findMissing(int arr[]) {
		int sum =0, orignalSum = (arr.length+1)*(arr.length+2)/2;
		for(int e : arr)
			sum+=e;
		return orignalSum-sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,6,7,8};
		System.out.println(findMissing(arr));
	}

}
