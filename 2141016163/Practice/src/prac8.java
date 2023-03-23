import java.util.ArrayList;

public class prac8 {
	public static void leaders(int arr[]){
		int max = Integer.MIN_VALUE;
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i= arr.length-1; i>=0; i--) {
			if(arr[i]>max) {
				ans.add(arr[i]);
				max = arr[i];
			}
		}
		for(int i =ans.size()-1; i>=0; i--)
			System.out.print(ans.get(i)+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,5,32,7, 4,5};
		leaders(arr);
	}

}
