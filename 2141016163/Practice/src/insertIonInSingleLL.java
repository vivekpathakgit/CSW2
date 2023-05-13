package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
class Node{
	int val;
	Node next;
	Node(int n){
		val = n;
	}
}
public class insertIonInSingleLL {
	public static void reverse(LinkedList<Integer> l) {
		int size = l.size();
		for(int i = size-1; i>=0; i--) {
			l.add(l.get(i));
			l.remove(i);
		}
	}
	public static Node rev(Node head) {
		Node p = null, q = head, r = head;
		while(q!=null) {
			r = q.next;
			q.next = p;
			p = q;
			q = r;
		}
		return p;
	}
	public static void display(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.val+" ");
			curr = curr.next;
		}
	}
	public static int size(Node head) {
		int s = 0;
		Node curr = head;
		while(curr!=null) {
			s++;
			curr = curr.next;
		}
		return s;
	}
	public static Node sort(Node head) {
		int size = size(head);
		Node newHead = head;
		while(size!=1) {
			Node p = newHead, q = p.next, prev = null;
			while(q!=null) {
				Node r = q.next;
				if(q.val<p.val) {
					q.next = p;
					p.next = r;
					if(prev==null) {
						prev = q;
						newHead = prev;
					}
					else {
						prev.next = q;
						prev = prev.next;
					}	
					q = r;
					
				}
				else {
					if(prev == null) {
						prev = p;
						newHead = prev;
					}
						
					else {
						prev.next = p;
						prev = prev.next;
					}
					p = q;
					q = r;	
				}
			}
			size--;
		}
		return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<Integer> l1 = new LinkedList<>();
//		l1.add(2);
//		l1.add(3);
//		l1.add(5);
//		char c = 'y';
//		while(c=='y') {
//			System.out.println("Insert Index and a Integer value : ");
//			Scanner sc = new Scanner(System.in);
//			int indx = sc.nextInt();
//			if(indx>=l1.size())
//				l1.add(sc.nextInt());
//			else 
//				l1.add(indx, sc.nextInt());
//			System.out.println("Do you want to insert more numbers? (y/n) ");
//			c = sc.next().charAt(0);
//		}
//		System.out.println(l1);
//		reverse(l1);
//		System.out.println(l1);
		
		Node head = null;
		Node curr = head;
		char c = 'y';
		while(c=='y') {
			System.out.println("Insert an Integer value : ");
			Scanner sc = new Scanner(System.in);
			if(head==null)
				head = curr = new Node(sc.nextInt());
			else {
				curr.next = new Node(sc.nextInt());
				curr = curr.next;
			}
			System.out.println("Do you want to insert more numbers? (y/n) ");
			c = sc.next().charAt(0);
		}
		//head = rev(head);
		display(head);
		System.out.println();
		head = sort(head);
		display(head);
	}

}
