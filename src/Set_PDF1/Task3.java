package Set_PDF1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Write the collection program to sort element from list and remove duplicate element.

public class Task3 {

	public static void main(String[] args) {

	List<Integer> al=new ArrayList();
		al.add(20);
		al.add(34);
		al.add(26);
		al.add(10);
		al.add(20);
		al.add(45);
		al.add(26);
		al.add(48);
		al.add(10);
		al.add(45);
		al.add(54);
		al.add(89);
		al.add(20);
	Collections.sort(al);
	System.out.println();
	System.out.println("List of Sorted Elements="+al);
	Set<Integer> s=new TreeSet(al);
	System.out.println("Rmove Duplicate Elements");

	for(Integer a : s)
	{
			System.out.println("  "+a);
	}
	}

}
