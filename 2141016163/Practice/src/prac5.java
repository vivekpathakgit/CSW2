import java.util.ArrayList;

public class prac5 {
	public static ArrayList<Integer> indices(int[]arr, int s){
		ArrayList<Integer> ans =new ArrayList<>();;
		int sum = 0;
		for(int i = 0, j=0; i<arr.length && j<=i; i++) {
			sum+=arr[i];
			if(sum>s) {
				sum = sum-arr[j++];
			}
			if(sum==s) {
				ans.add(j+1);
				ans.add(i+1);
			}
		}
		if(ans.isEmpty()) {
			ans.add(-1);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,3,6,4};
		System.out.println(indices(arr, 6));
	}

}
