package Set_PDF1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Write the collection program to sort element from list and not remove duplicate element.


public class Task4 {

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
	Collections.sort(al,Collections.reverseOrder());

	System.out.println("List of Sorted Elements in Decending Order="+al);
	//Set<Integer> s=new HashSet(al);
	//	System.out.println(s);
		
	System.out.println("With Duplicate Elements");

	for(Integer a : al)
	{
	System.out.println("  "+a);
	}
	}

}


