
public class Q3 {

	
	public static int maxsubarray(int[]a) {
		int n=a.length;
		int maxSum=-100;
		int currSum=0;
		for(int i=0;i<n;i++) {
			currSum+=a[i];
			if(maxSum<currSum) {
				maxSum=currSum;
				
			}
			if(currSum<0) {
				currSum=0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {4,-3,5,-1,6};
     System.out.println(maxsubarray(a));
	}

}
