package Set_PDF1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Write the collection program for Set of List of String.With using generic and for each loop


public class Task8_iii {

	public static void main(String[] args) {

		List<String> mh=new ArrayList();
		mh.add("pune");
		mh.add("Mumbai");
		
		List<String> jh=new ArrayList();
		jh.add("Lohardaya");
		jh.add("Ranchi");
		
		Set<List<String>> india=new LinkedHashSet();
		india.add(mh);
		india.add(jh);
		
		for(List<String> a:india)
		{
			for(String aa:a)
			{
				System.out.println("  "+aa);
			}
		}
	}	
	}



