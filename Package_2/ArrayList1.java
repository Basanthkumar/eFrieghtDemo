package Package_2;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> value1 = new ArrayList<Integer>();

		// Adding values in to the array list , using traditional for loop
		System.out.println("the values of ArrayList value1 is  ");
		for (int i = 0; i <= 20; i++) {
			value1.add(i);
			System.out.println(value1.get(i));
		}

		// Displaying the size before removing some elements in the arrayList

		// Removing Values from the array list
		value1.remove(0);
		value1.remove(0);
		value1.remove(0);

		// declaring new arraylist value2
		ArrayList<Integer> value2 = new ArrayList<Integer>();

		// tryin the copy the values from value1 to value 2
		System.out.println("the values of ArrayList value2 is  ");
		for (int k = 0; k < value1.size(); k++) {
			value2.add(value1.get(k));
			// System.out.println(value2.get(k));

		}

		/*
		 * for (int j=0;j<=value2.size()-1;j++) {
		 * System.out.println(value2.get(j)); }
		 */

		// Displaying the values in the arraylist using enhanced for loop
		for (Integer j : value2) {
			System.out.println(j);
		}

		// Displaying the size after removing some elements in the arrayList
		System.out.println("Value1 size is " + value1.size());
		System.out.println("Value2 size is " + value2.size());

		System.out.println(value1);
	}

}
