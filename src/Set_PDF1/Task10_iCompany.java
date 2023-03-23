package Set_PDF1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Wtite the collection program for List of Set of Employee. Without generic

public class Task10_iCompany {

	
		public List designation()
		{
			Scanner sc=new Scanner(System.in);
			Task10_Employee e=new Task10_Employee();
			Task10_Employee e1=new Task10_Employee();
			Task10_Employee e2=new Task10_Employee();
			Task10_Employee e3=new Task10_Employee();
			Task10_Address ad=new Task10_Address();
			Task10_Address ad1=new Task10_Address();
			Task10_Address ad2=new Task10_Address();
			Task10_Address ad3=new Task10_Address();

			 System.out.println("Enter First Employee Records");
			 System.out.println("----------------------------");
			 System.out.print("  Emp Id = ");
			 e.setEid(sc.nextInt());
			 System.out.print("  Emp Name = ");
			 e.setEname(sc.next());
			 System.out.print("  Emp Salary  = ");
			 e.setEsalary(sc.nextDouble());
			 System.out.print("  Emp City  = ");

			 ad.setCity(sc.next());
			 System.out.print("  Emp Area  = ");
			 ad.setArea(sc.next());
			 e.setAdr(ad);
			
			 System.out.println("Enter second Employee Records");
			 System.out.println("----------------------------");
			 System.out.print("  Emp Id = ");	  
			 e1.setEid(sc.nextInt());
			 System.out.print("  Emp Name = ");
			 e1.setEname(sc.next());
			 System.out.print("  Emp Salary  = ");
			 e1.setEsalary(sc.nextDouble());
			 System.out.print("  Emp City  = ");
			 ad1.setCity(sc.next());
			 System.out.print("  Emp Area  = ");
			 ad1.setArea(sc.next());
			 e1.setAdr(ad1);
			 
			 
			 System.out.println("Enter Third Employee Records");
			 System.out.println("----------------------------");
			 System.out.print("  Emp Id = ");
			 e2.setEid(sc.nextInt());
			 System.out.print("  Emp Name = ");
			 e2.setEname(sc.next());
			 System.out.print("  Emp Salary  = ");
			 e2.setEsalary(sc.nextDouble());
			 System.out.print("  Emp City  = ");
			 ad2.setCity(sc.next());
			 System.out.print("  Emp Area  = ");
			 ad2.setArea(sc.next());
			 e2.setAdr(ad2);
			 
			 
			 System.out.println("Enter Fourth Employee Records");
			 System.out.println("----------------------------");
			 System.out.print("  Emp Id = ");
			 e3.setEid(sc.nextInt());
			 System.out.print("  Emp Name = ");
			 e3.setEname(sc.next());
			 System.out.print("  Emp Salary  = ");
			 e3.setEsalary(sc.nextDouble());
			 System.out.print("  Emp City  = ");
			 ad3.setCity(sc.next());
			 System.out.print("  Emp Area  = ");
			 ad3.setArea(sc.next());
			 e3.setAdr(ad3);
			 
			 
			 Set developer=new HashSet();
			 developer.add(e);
			 developer.add(e1);
			 
			 Set tester=new HashSet();
			 tester.add(e2);
			 tester.add(e3);
			 
			 List  team=new ArrayList();
			 team.add(developer);
			 team.add(tester);
			 return team;
		}
		
			 public static void main(String args[])
			 {
				 Task10_iCompany c=new Task10_iCompany();
				 List data=c.designation();
				Iterator itr=data.iterator();
				System.out.println("   EMPLOYEE    RECORDS ");
				System.out.println("------------------------------");
				 while(itr.hasNext())
				 {
					 Set em=(Set)itr.next();
					 Iterator itr1=em.iterator();
					 while(itr1.hasNext())
					 {
						 Task10_Employee em1=(Task10_Employee) itr1.next();
						 
					 System.out.println("Emp Id     = " +em1.getEid());
					 System.out.println("Emp Name   = " +em1.getEname());
					 System.out.println("Emp Salary = " +em1.getEsalary());
					 System.out.println("Emp City   = " +em1.getAdr().getCity());
					 System.out.println("Emp Area   = " +em1.getAdr().getArea());
					 System.out.println();
					
					 
			 }
				 
				 
			 }
			 }
}
