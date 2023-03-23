package Set_PDF1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task9_3College {
	public Set<Task9_2Student> m1()
	{
   Scanner sc=new Scanner(System.in);
   Task9_2Student st=new Task9_2Student();
   Task9_2Student st1=new Task9_2Student();
   Task9_1Address ad=new Task9_1Address();
   Task9_1Address ad1=new Task9_1Address();
   
   System.out.println("Enter first Student Records");
   System.out.println("----------------------------");
   System.out.print(" Roll no = ");
   st.setRollno(sc.nextInt());
   System.out.print(" Name =");
   st.setName(sc.next());
   System.out.print(" City = ");
   ad.setCityname(sc.next());
   System.out.print(" Area = ");
   ad.setAreaname(sc.next());
   st.setAdr(ad);
   
   System.out.println("Enter second Student Records");
   System.out.println("----------------------------");
   System.out.print(" Roll no = ");
   st1.setRollno(sc.nextInt());
   System.out.print(" Name =");
   st1.setName(sc.next());
   System.out.print(" City = ");
   ad1.setCityname(sc.next());
   System.out.print(" Area = ");
   ad1.setAreaname(sc.next());
   st1.setAdr(ad1);

   Set<Task9_2Student> fe=new LinkedHashSet();
   fe.add(st);
   fe.add(st1);
   
  return fe;
}
}
