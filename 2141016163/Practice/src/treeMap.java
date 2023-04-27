import java.util.TreeSet;

public class treeMap {
	public static void main(String[] args) {
		// create a tree map.
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set.
		ts.add("India");
		ts.add("USA");
		ts.add("Brazil");
		System.out.println(ts); 
		ts.remove( ts.size()-1);
		System.out.println(ts);
		System.out.println(ts.size());
		}

}
