package com.sundarbtechict.student.studentmangement;

import java.util.*;

public class Crud {
	ArrayList<Student> a =new ArrayList<Student>();
	Scanner s =new Scanner(System.in);
	void create()
	{
		System.out.println("enter your details");
		System.out.println("Name:");
		String name=s.next();
		System.out.println("Register no:");
		int regno=s.nextInt();
		System.out.println("Date of Birth:");
		String dob=s.next();
		System.out.println("Email:");
		String email=s.next();
		System.out.println("Mobile:");
		String mobile=s.next();
		System.out.println("Department:");
		String dept=s.next();
		Student ss=new Student(regno,name,dob,email,mobile,dept);
		a.add(ss);
	}
	void read()
	{
		System.out.println("Enter your register no to display:");
		int r=s.nextInt();
		boolean f=false;
		for(Student ss:a)
		{
			if(r==ss.regno)
			{
			System.out.print("Name:");
			System.out.println(ss.name);
			System.out.println("Register no:");
			System.out.println(ss.regno);
			System.out.println("Date of Birth:");
			System.out.println(ss.dob);
			System.out.println("Email:");
			System.out.println(ss.email);
			System.out.println("Mobile:");
			System.out.println(ss.mobile);
			System.out.println("Department:");
			System.out.println(ss.dept);
			f=true;break;
			}
		}
		if(f==false)
		{
			System.out.println("Invalid register no");
		}
	}
	void readAll()
	{
		for(Student ss:a)
		{
			System.out.print("Name:");
			System.out.println(ss.name);
			System.out.println("Register no:");
			System.out.println(ss.regno);
			System.out.println("Date of Birth:");
			System.out.println(ss.dob);
			System.out.println("Email:");
			System.out.println(ss.email);
			System.out.println("Mobile:");
			System.out.println(ss.mobile);
			System.out.println("Department:");
			System.out.println(ss.dept);
		}
	}
	void update()
	{
		System.out.println("Enter your register no to update:");
		int r=s.nextInt();
		boolean f=false;
		ListIterator<Student> l= a.listIterator();
		while(l.hasNext())
		{
			Student st=l.next();
			if(r==st.regno)
			{
				System.out.println("enter your details");
				System.out.println("Name:");
				String name=s.next();
				System.out.println("Register no:");
				int regno=s.nextInt();
				System.out.println("Date of Birth:");
				String dob=s.next();
				System.out.println("Email:");
				String email=s.next();
				System.out.println("Mobile:");
				String mobile=s.next();
				System.out.println("Department:");
				String dept=s.next();
				Student ss=new Student(regno,name,dob,email,mobile,dept);
				l.set(ss);f=true;break;
			}
		}
		if(f==false)
		{
			System.out.println("Invalid register no");
		}
	}
	void  delete()
	{
		System.out.println("Enter your register no to delete:");
		int r=s.nextInt();
		boolean f=false;
		ListIterator<Student> l= a.listIterator();
		while(l.hasNext())
		{
			Student st=l.next();
			if(r==st.regno)
			{
			l.remove();f=true;break;
			}
		}
		if(f==false)
		{
			System.out.println("Invalid register no");
		}
	}
	void deleteAll()
	{
		a.removeAll(a);
	}


}
