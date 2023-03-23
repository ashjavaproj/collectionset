package Set_PDF1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Write the collection program for Set of Set of String.With using generic and for each loop

public class Task7_iii {

	public static void main(String[] args) {
		Set<String> mh=new HashSet();
		mh.add("pune");
		mh.add("Mumbai");
		
		Set<String> gj=new HashSet();
		gj.add("Ahemdabad");
		gj.add("Surat");
		
		Set<Set<String>> india=new LinkedHashSet();
		india.add(mh);
		india.add(gj);
		
		for(Set<String> a:india)
		{
			for(String aa:a)
			{
				System.out.println(" "+aa);
			}
		}
	}	
	}
