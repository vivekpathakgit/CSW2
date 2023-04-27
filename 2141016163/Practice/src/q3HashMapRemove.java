import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q3HashMapRemove {
	public static void remove(HashMap<Integer, String> map, int key, String value) {
		if(map.get(key).equals(value))
			map.remove(key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(2,"AAA");
		map.put(4,"VVV");
		map.put(5,"ABB");
		map.put(6,"TTT");
		System.out.println("Enter Key : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println("Enter value");
		String value = sc.next();
		remove(map, key, value);
		System.out.println(map.get(5));
	}

}
