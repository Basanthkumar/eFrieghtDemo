package Package_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// Linked List holds the value of the memory location of the next element in the list
public class ArrayListAndLinkedListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		timingCompare("ArrayList", arrayList);
		timingCompare("LinkedList", linkedlist);
	}

	static void timingCompare(String Listname, List<Integer> lists) {
		for (int i = 0; i < 500000; i++) {
			lists.add(i);
		}
		double start = System.currentTimeMillis();
		
		for (int i = 0; i < 5000; i++) {
			lists.add(i);
		}
		double end = System.currentTimeMillis();
		
		System.out.println("The time taken by" + Listname + "is"+ (end - start)+"ms");

		//Linked Lsit is preferrable when elements needs to be added in the middle or at the beginning
		//Arraylist is preferrable when elements needs to added at the end

	}

}
