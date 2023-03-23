package Set_PDF1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Write the collection program for Set of Set of String.With using generic and iterator

public class Task7_ii {

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
		
		Iterator<Set<String>> itr1=india.iterator();
		while(itr1.hasNext())
		{
			Set a= itr1.next();
		Iterator itr2=a.iterator();
			while(itr2.hasNext())
			{
			String	aa=(String) itr2.next();
			System.out.println(aa);
	}
	}	
	}	
	}
