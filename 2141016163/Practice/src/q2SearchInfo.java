import java.util.LinkedList;
class Node {
	int data;
	Node next;
	Node(int a){
		data = a;
		next = null;
	}
}
public class q2SearchInfo {
	public static Node search( Node head, Node item){
		Node curr = head, prev = null;
		while(curr!=null) {
			if(curr==item) {
				Node temp = head;
				if(prev!=null) {
					prev.next = curr.next;
				}
				curr.next = head;
				return curr;
			}
			prev = curr;	
			curr = curr.next;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node item = new Node(4);
		Node n1 = new Node(2);
		n1.next = new Node(9);
		n1.next.next = item;
		n1.next.next.next = new Node(8);
		n1.next.next.next.next = new Node(3);
		System.out.println(search(n1, item));
		Node curr = item;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}

}
