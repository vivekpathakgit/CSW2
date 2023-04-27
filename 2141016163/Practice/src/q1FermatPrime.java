
public class q1FermatPrime {
	public static boolean isPrime(int n) {
		for(int i = 2; i<Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void fermatPrime(int n) {
		int count = 0,i =0;
		while(count!=n) {
			int num =(int) (Math.pow(2, Math.pow(2, i))+1);
			if(isPrime(num)) {
				System.out.println(num);
				count++;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fermatPrime(6);
	}
}
