package Package_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapValues = new HashMap<Integer, String>();
		mapValues.put(1, "Apple"); // adding values into hash Map
		mapValues.put(2, "Banana");//
		mapValues.put(3, "cucumber");
		mapValues.put(4, "deyFruits");
		mapValues.put(6, "egg");
		mapValues.put(7, "egg");// hashMap can have the same values
		mapValues.put(6, "eggOverridden");// Hapmap cannot have duplicate keys , duplicate key overrides the
		mapValues.put(5, "orrange");									// previous key
		Scanner scan = new Scanner(System.in);
		mapValues.put(13, "orrange");
		
		//entrying the values using the scanner to hasmap using traditional for loop
		System.out.println("please Enter three values to put into HashMap");
		for(int i=8;i<10;i++)
		{
			String s = scan.nextLine();
			mapValues.put(i, s);
		}
		
		//getting the values using enhanced for loop
		System.out.println("getting the values using enhaynced for loop ");
		System.out.println("The Vaules of Hash map is ");
	
		//Set<Integer,String> set1	=	mapValues.entrySet();
		
		
		
		//Map.Entry<Integer,String> value1 = mapValues.entrySet(Integer,String);
		for(Map.Entry<Integer, String>  values1 : mapValues.entrySet())
		{
			int key = values1.getKey();
			String s = values1.getValue();
			System.out.println("Key is "+key+"And Values is : "+s);
		}
		
		/*for(Integer key:mapValues.keySet())
		{
			
			
			System.out.println("Key is "+key+"And Values is : "+mapValues.get(key));
		}*/

		System.out.println("");
		System.out.println("");
		
		
		System.out.println("getting the values using traditional for loop ");
		for(int j =0 ; j<=13;j++)
		{
			if(mapValues.get(j)!=null)
			System.out.println("the value of the key is : "+j+" and its value is : "+mapValues.get(j));
		}
		System.out.println("");
		System.out.println(mapValues.size());
	}

}
