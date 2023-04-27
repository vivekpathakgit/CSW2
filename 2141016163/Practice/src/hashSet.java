import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(4);
		set.add(5);
		set.add(4);
		set.add(6);
		set.add(8);
		System.out.println(set);
		set.remove(4);
		System.out.println(set);
		System.out.println(set.contains(5));
		//Main hoon ek udta robo, dooremonnn.....
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		//Uddi jaiye re kabootar udi jaiye re.....
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Sushil");
		map.put(2, "Sunil");
		map.put(3, "kunal");
		
		System.out.println(map.containsKey(3));
		System.out.println(map);
		
		map.put(1, "Rakesh");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}	

}
