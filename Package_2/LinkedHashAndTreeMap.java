package Package_2;


import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
public class LinkedHashAndTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		//Linked hash Map maintains the insertion oder
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		//Tree maps maintains the Natural order
		System.out.println("Tthe Linked hash map is ");
		dosomeactivity(linkedhashmap);
		System.out.println();
		System.out.println();
		System.out.println("Tthe tree map is ");
		dosomeactivity(treemap);
		}
	static void dosomeactivity(Map<Integer,String> maps)
	{
		maps.put(1, "Sharath");
		maps.put(2, "Sharath2");
		maps.put(3, "Sharath3");
		maps.put(4, "Sharath4");
		maps.put(7, "Sharath7");
		maps.put(8, "Sharath8");
		maps.put(5, "Sharath5");
		maps.put(6, "Sharath6");
		
		for(Integer key : maps.keySet())
		{
			String value3 = maps.get(key);
			System.out.println("The value of the key is :"+key+"and is valu is :"+value3);
		}
		
		}
		
	}


