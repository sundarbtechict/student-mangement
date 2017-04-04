package com.sundarbtechict.student.studentmangement;

import java.util.*;

public class StudentMangement {
	ArrayList<Student> a =new ArrayList<Student>();
	Scanner s =new Scanner(System.in);
	void create()
	{
		System.out.println("enter your details");
		Student ss=new Student();
		System.out.println("Name:");
		ss.setName(s.next());
		System.out.println("Register no:");
		ss.setRegNo(s.nextInt());
		System.out.println("Date of Birth:");
		ss.setDob(s.next());
		System.out.println("Email:");
		ss.setEmail(s.next());
		System.out.println("Mobile:");
		ss.setMobile(s.next());
		System.out.println("Department:");
		ss.setDept(s.next());
		a.add(ss);
	}
	void read()
	{
		System.out.println("Enter your register no to display:");
		int r=s.nextInt();
		boolean f=false;
		for(Student ss:a)
		{
			if(r==ss.getRegNo())
			{
			System.out.print("Name:");
			System.out.println(ss.getName());
			System.out.print("Register no:");
			System.out.println(ss.getRegNo());
			System.out.print("Date of Birth:");
			System.out.println(ss.getDob());
			System.out.print("Email:");
			System.out.println(ss.getEmail());
			System.out.print("Mobile:");
			System.out.println(ss.getMobile());
			System.out.print("Department:");
			System.out.println(ss.getDept());
			System.out.println("-----------------------------");
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
			System.out.println(ss.getName());
			System.out.print("Register no:");
			System.out.println(ss.getRegNo());
			System.out.print("Date of Birth:");
			System.out.println(ss.getDob());
			System.out.print("Email:");
			System.out.println(ss.getEmail());
			System.out.print("Mobile:");
			System.out.println(ss.getMobile());
			System.out.print("Department:");
			System.out.println(ss.getDept());
			System.out.println("-----------------------------");
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
			if(r==st.getRegNo())
			{
				Student ss=new Student();
				System.out.println("Name:");
				ss.setName(s.next());
				System.out.println("Register no:");
				ss.setRegNo(s.nextInt());
				System.out.println("Date of Birth:");
				ss.setDob(s.next());
				System.out.println("Email:");
				ss.setEmail(s.next());
				System.out.println("Mobile:");
				ss.setMobile(s.next());
				System.out.println("Department:");
				ss.setDept(s.next());
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
			if(r==st.getRegNo())
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

