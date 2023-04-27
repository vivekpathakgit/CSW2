
public class prac16 {
	public static void maxSumSubarray(int arr[]) {
		int Currsum = 0, max = Integer.MIN_VALUE, tempstart = 0,start = 0, end = arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			Currsum += arr[i];

			if (Currsum  >= max) {
				max = Currsum ;
				start = tempstart;
				end = i;
			}
			if (Currsum  < 0) {
				Currsum = 0;
				tempstart = i+1;
			}
			

		}
		System.out.println(start+" "+end);
		System.out.println(max);
		for(int i =start; i<=end; i++) System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, -4, -5, -7, -4 };
		maxSumSubarray(arr);
	}

}
