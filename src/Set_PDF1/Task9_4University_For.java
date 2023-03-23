package Set_PDF1;

import java.util.Set;

public class Task9_4University_For {
	public static void main(String[] args) {
		
	
	Task9_3College c=new Task9_3College();
	Set<Task9_2Student> data=c.m1();
	System.out.println("  Rollno       Name        City         Area  ");
	System.out.println("----------------------------------------------------");
	
	for(Task9_2Student s1:data)
	{
		System.out.print("  "+s1.getRollno());
		System.out.print("        "+s1.getName());
		System.out.print("        "+s1.getAdr().getCityname());
		System.out.print("        "+s1.getAdr().getAreaname());
		System.out.println();
	
	}
	}
}
