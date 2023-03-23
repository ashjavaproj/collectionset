package Set_PDF1;

// Write the collection program to remove duplicate element from list.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1
 {

	public static void main(String[] args) {
		List<String> al=new ArrayList();
		al.add("Abc");
		al.add("ABC");
		al.add("Abc");
		al.add("ABC");
		al.add("ABc");
		al.add("Abc");
		al.add("ABC");
     Set<String> s=new HashSet(al);
     for(String a:s)
     {
    	 System.out.println(a);
     }
	}

}
