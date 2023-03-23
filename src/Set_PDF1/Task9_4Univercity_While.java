package Set_PDF1;

//Write the collection program for Set of Student use generic and using iterator and for each loop.

import java.util.Iterator;
import java.util.Set;

public class Task9_4Univercity_While {

	public static void main(String[] args) {
		
		Task9_3College c=new Task9_3College();
		Set<Task9_2Student> data=c.m1();
		System.out.println("  Rollno     Name      City       Area  ");
		System.out.println("----------------------------------------------------");
		Iterator<Task9_2Student> itr=data.iterator();
		while(itr.hasNext())
		{
			Task9_2Student s1=itr.next();
						
			System.out.print("    "+s1.getRollno());
			System.out.print("        "+s1.getName());
			System.out.print("        "+s1.getAdr().getCityname());
			System.out.print("        "+s1.getAdr().getAreaname());
			System.out.println();
		}
		}
		}

	


