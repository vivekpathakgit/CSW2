import java.util.ArrayList;
import java.util.Scanner;

public class A2aQ01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(1);
		System.out.println(arr);
		System.out.println("Enter a number to search : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(arr.contains(n)) 
			System.out.println("Number is Present.");
		else
			System.out.println("Number is Not Present!");
		System.out.println("Enter a position to remove element : ");
		int i = sc.nextInt();
		arr.remove(i);
		System.out.println(arr);
		if(arr.isEmpty())
			System.out.println("List is empty.");
		else 
			System.out.println("List is not empty.");
	}

}
