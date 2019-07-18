package Package_2;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetAndTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
		TreeSet<String> treeset = new TreeSet<String>();

		System.out.println("The value of linkedhashset is ");
		PerFormingActionsOnSets(linkedhashset);
		System.out.println("The value of Treeset is ");
		PerFormingActionsOnSets(treeset);
		
		
	}

	static void PerFormingActionsOnSets(Set<String> set) {

		set.add("Apple");
		set.add("Banana");
		set.add("Mangoes");
		set.add("Grapes");
		set.add("Mangoes");
		set.add("PineApple");
		set.add("Watermelon");

		for (String value4 : set) {
			System.out.println(value4);
		}
		set.remove("Watermelon");
		
		System.out.println("The value after removing from the set ");
		for (String value4 : set) {
			System.out.println(value4);
		}
	}
}
