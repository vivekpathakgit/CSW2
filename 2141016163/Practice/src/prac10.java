
public class prac10 {
	public static int stocks(int arr[]) {
		int max = 0;
		int start =-1, end = -1, maxyet = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i+1]-arr[i]>=0) {
				max +=  arr[i+1]-arr[i] ;
				if(start == -1) {
					start = i;
					end = i+1;
				}
				if(i==end) {
					end = i+1;
				}
				if(maxyet<end-start+1) maxyet = end-start+1;
			}
			
		}
		System.out.println(maxyet);
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-|generated method stub
		int arr[] = {1,3,4,5,3,5,8};
		if(stocks(arr)>0)
			System.out.println(1 + " , Total profit : "+stocks(arr));
		else 
			System.out.println(0);
	}

}
