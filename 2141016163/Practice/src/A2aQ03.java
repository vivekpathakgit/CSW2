import java.util.Stack;

public class A2aQ03 {
	public static int decToBin(int n) {
		Stack <Integer>s = new Stack<>();
		while(n!=0) {
			s.push(n%2);
			n = n/2;
		}
		int i = s.size()-1; int l = 0;
		while(!s.isEmpty()) {
			l= (int)Math.pow(10, i--)*s.pop()+l;
		}
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decToBin(4));
	}

}
