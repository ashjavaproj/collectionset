package Set_PDF1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Write the collection program for Set of List of String.iii)With using generic and iterator


public class Task8_ii {

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
		
		Iterator<List<String>> itr1=india.iterator();
		while(itr1.hasNext())
		{
			List a=itr1.next();
		Iterator itr2=a.iterator();
			while(itr2.hasNext())
			{
			String	aa=(String) itr2.next();
			System.out.println("  "+aa);
	}
	}	
	}	
	}



