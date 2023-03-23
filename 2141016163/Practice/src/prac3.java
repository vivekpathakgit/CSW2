import java.util.HashMap;

public class prac3 {
	public static int majority(int[]arr, int k) {
		HashMap <Integer, Integer> hs = new HashMap<>();
		for(int e : arr) {
			if(hs.containsKey(e)) {
				if(hs.get(e)+1==k)return e;
				hs.put(e, hs.get(e)+1);
			}
			else hs.put(e, 1);
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,5,43,3,4,5,5,6,6,6};
		int k = 3;
		System.out.println(majority(arr, k));
	}

}
