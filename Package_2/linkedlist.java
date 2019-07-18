package Package_2;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> value3= new LinkedList<String>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the names");
		for(int i=0;i<4;i++)
		{
			value3.add(scan.nextLine());
		}

		System.out.println("The Linked value list are "+value3);
		
		//adding elements into the array list 
		
	}

}
