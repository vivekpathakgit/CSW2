import java.util.Arrays;
import java.util.HashMap;

public class prac2 {
	static boolean equal2(int []in1, int []in2) {
		HashMap<Integer, Integer> hs1 = new HashMap<>();
		HashMap<Integer, Integer> hs2 = new HashMap<>();
		
		for(int i = 0; i<in1.length; i++) {
			if(hs1.containsKey(in1[i])) {
				hs1.put(in1[i], hs1.get(in1[i])+1);
			}
			else hs1.put(in1[i], 1);
			
			if(hs1.containsKey(in2[i])) {
				hs1.put(in2[i], hs1.get(in2[i])+1);
			}
			else hs1.put(in2[i], 1);
		}
		return hs1.equals(hs2);
	}
	static boolean equal1(int []in1, int []in2) {
		Arrays.sort(in1);
		Arrays.sort(in2);
		return Arrays.equals(in2, in1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] in1 = {1,2,34,4,5};
		int [] in2 = {1,2,4,5,34};
		System.out.println(equal1(in1, in2));
		//equal-1  has TC = O(n log n) & SC = inputSpace.
	}

}
