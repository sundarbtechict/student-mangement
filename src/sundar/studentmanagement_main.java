33package sundar;
import java.util.*;
class Student
{
	int regno;
	String name;
	String dob;
	String email;
	String mobile;
	String dept;
	Student(int r,String n,String db,String e,String m,String dt)
	{
		regno=r;
		name=n;
		dob=db;
		email=e;
		mobile=m;
		dept=dt;
	}
}
class Crud
{	
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
class studentmanagement_main
{
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		Crud c= new Crud();
		int n=1;
		do{
			System.out.println("--------------------------");
			System.out.println("	choices:");
			System.out.println("1.	create");
			System.out.println("2.	Read");
			System.out.println("3.	Read all");
			System.out.println("4.	Update");
			System.out.println("5.	Delete");
			System.out.println("6.	Delete All");
			System.out.println("0.	Exit");
			System.out.println("--------------------------");
			System.out.println("Enter your choice:");
			n=s.nextInt();
			if(n==1)
			{
				c.create();
			}
			else if(n==2)
			{
				c.read();
			}
			else if(n==3)
			{
				c.readAll();
			}
			else if(n==4)
			{
				c.update();
			}
			else if(n==5)
			{
				c.delete();
			}
			else if(n==6)
			{
				c.deleteAll();
			}
			else
			{
				System.out.println("Ivalid chioce");
			}
		}while(n!=0);
	}
}