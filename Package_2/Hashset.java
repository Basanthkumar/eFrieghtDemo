package Package_2;

import java.util.HashSet;
//Hashset are not sorted
//No dulpicates are allowed
//Contains only unique elements

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add("Apple");
		hashset.add("Banana");
		hashset.add("Mangoes");
		hashset.add("grapes");
		hashset.add("Mangoes");
		hashset.add("PineApple");
		hashset.add("Watermelon");
		
		
		for(String value3:hashset)
		{
			System.out.println(value3);
		}
		
		if(hashset.contains("Mangoes"))
		{
			System.out.println("hashset contains mangoes");
		}
	
		System.out.println(hashset);
		
	}

}
