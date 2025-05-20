package examples;

public class ClassObjectEx1 {
	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		//Employee s=new Student();//error
		Student s=new Student();
		
		Employee e=a;
		
		System.out.println(a);
		System.out.println(e);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		a.name="Cheetah khan";
		a.salary=10000000;
		a.cname="ABC";
		
		e.salary=21;
		
		b.name="Yoyo Gupta";
		b.salary=800000000;
		b.cname="XYZ";
		
		c.name="Kaaliya Singh";
		c.salary=8000;
		c.cname="MNO";
		
		d.name="Teja Singh";
		d.salary=1000000000;
		d.cname="PQR";
		

		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(e.name+" "+e.salary+" "+e.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
	}
}

class Employee{
	String name;
	int salary;
	String cname;
}
class Student{
	String name;
	int fee;
	String sname;
}