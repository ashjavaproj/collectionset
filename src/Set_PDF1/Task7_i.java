package Set_PDF1;



import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



//Write the collection program for Set of Set of String.Without using generic

public class Task7_i {

	public static void main(String[] args) {

		Set mh=new HashSet();
		mh.add("pune");
		mh.add("Mumbai");
		
		Set gj=new HashSet();
		gj.add("Ahemdabad");
		gj.add("Surat");
		
		Set india=new LinkedHashSet();
		india.add(mh);
		india.add(gj);
		
		Iterator itr1=india.iterator();
		while(itr1.hasNext())
		{
			Set a=(Set) itr1.next();
		Iterator itr2=a.iterator();
			while(itr2.hasNext())
			{
			String	aa=(String) itr2.next();
			System.out.println(aa);
	}
	}	
	}	
	}
