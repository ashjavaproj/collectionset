package Set_PDF1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Write the collection program to remove duplicate element from list and retrive element indexwise.(use generic)

public class Task2 {

	public static void main(String[] args) {
		List<Object> al=new ArrayList();
		al.add(20.20f);
		al.add(34.1f);
		al.add(26.23f);
		al.add(10);
		al.add(20.20f);
		al.add(45);
		al.add(26.23f);
		al.add(48.7f);
		al.add(10);
		al.add(45);
		al.add(54);
		al.add(89);
		al.add(20);
     Set<Object> s=new LinkedHashSet(al);
     for(Object a : s)
     {
    	 if(a instanceof Integer)
    	 {
    	 System.out.println(a);
    	 }
    	 else if(a instanceof Float)
    	 {
    		 System.out.println(a);
    	 }
     }
	}

}