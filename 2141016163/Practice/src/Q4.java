
public class Q4 {

	public static int nthFib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return nthFib(n-1)+nthFib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(nthFib(4));
	}

}
