
public class Q5 {
 
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
   System.out.println(gcd(2,8));
	}

}
         					