
public class minMaxHeights {
	public static int minMax(int arr[], int min, int max, int i, int k) {
		if(i==arr.length) return max-min;
		int a;
		if(arr[i]-k>=0) {
			arr[i] =  arr[i]-k ;
			 a= minMax(arr, arr[i]<min? arr[i] : min, arr[i]>min? arr[i] : min, i+1, k);
		}
		else a = Integer.MAX_VALUE;
		arr[i]= arr[i]+2*k;
		int b = minMax(arr, arr[i]<min? arr[i] : min, arr[i]>min? arr[i] : min, i+1, k);
		return Math.min(a, b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,6};
		System.out.println(minMax(arr, 0, 0, 0, 5));
	}

}
