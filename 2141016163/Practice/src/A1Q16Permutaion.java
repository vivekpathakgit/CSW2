import java.util.ArrayList;
import java.util.List;

public class A1Q16Permutaion {
	public static void permutation(ArrayList<Integer> l, ArrayList<Integer> temp) {
		if(l.size()==0) {
			for(int e : temp)
				System.out.print(e+" ");
			System.out.println();
			return;
		}
		for(int i =0; i<l.size(); i++) {
			temp.add(l.remove(i));
			permutation(l, temp);
			l.add(i,temp.remove(temp.size()-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(1);
		permutation(l, new ArrayList<Integer>());
		
	}

}
