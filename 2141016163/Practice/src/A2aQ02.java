import java.util.LinkedList;
import java.util.Scanner;

class student {
	String name;
	int age;
	int mark;
	student(String n, int a, int m){
		name = n;
		age = a;
		mark = m;
	}
}
public class A2aQ02 {
	public static void printAll(LinkedList<student> l) {
		for(int i =0 ; i<l.size(); i++) {
			System.out.println("Name : "+l.get(i).name+" , Age : " + l.get(i).age+ " , Marks : "+ l.get(i).mark);
		}
	}
	public static int search(LinkedList <student>l, student s) {
		for(int i = 0; i<l.size(); i++) {
			if(s.name.equals(l.get(i).name) && s.age==l.get(i).age && s.mark==l.get(i).mark)
				return i;
		}
		return -1;
	}
	public static void remove(LinkedList<student> l, student s) {
		int indx = search(l, s);
		if(indx!=-1) l.remove(indx);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<student> l1 = new LinkedList<>();
		l1.add(new student("Rahul", 19, 88));
		l1.add(new student("Sushil", 20, 98));
		l1.add(new student("Rakesh", 19, 86));
		l1.add(new student("Lokesh", 21, 95));
		printAll(l1);
		System.out.println("Object to be searched : (enter name, age and marks)");
		if(search(l1, new student(sc.next(), sc.nextInt(), sc.nextInt()))!=-1)
			System.out.println("Object was found!");
		else
			System.out.println("Object was not found!");
		System.out.println("Enter object to be removed : (enter name, age and marks)");
		remove(l1, new student(sc.next(), sc.nextInt(), sc.nextInt()));
		printAll(l1);
		System.out.println("Number of objects in linked list : "+l1.size());
	}

}
