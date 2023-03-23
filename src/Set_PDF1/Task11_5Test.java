package Set_PDF1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task11_5Test {
	
	public Set show()
	{
		Scanner sc=new Scanner(System.in);
		Task11_1University u=new Task11_1University();
		Task11_2College c=new Task11_2College();
		Task11_3Branch b=new Task11_3Branch();
		Task11_4Student s=new Task11_4Student();
		u.setUcode(sc.nextInt());
		u.setUname(sc.next());
		u.setLoc(sc.next());
		c.setCcode(sc.nextInt());
		c.setCname(sc.next());
		c.setCadd(sc.next());
		c.setUr(u);
		b.setBname(sc.next());
		b.setCl(c);
		s.setRno(sc.nextInt());
		s.setSname(sc.next());
		s.setBr(b);
		
		List<Task11_4Student> al=new ArrayList();
		al.add(u);
		al.add(c);
		al.add(b);
		al.add(s);
	
		Set<List<Task11_4Student>> s1=new HashSet(al);
		return s1;
	}
	public static void main(String[] args) {
		
		Task11_5Test t1=new Task11_5Test();
		Set<List<Task11_4Student>> data=t1.show();
    for(List<Task11_4Student> a:data)
	
		{
    	for(Task11_4Student aa:a)
			System.out.println(aa.getRno());
    		System.out.println(aa.getSname());
    		System.out.println(aa.getbr());
    		
		}
	}
}

		
