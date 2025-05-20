package examples;

class Emp{
	//System.out.println("Hello Emp"); //error
	void m() {
		System.out.println("Hello Emp");
	}
	String name; //Data Member/State/Field
	int salary=90000; //Data Member/State/Field
	//salary=90000;//error
	
	void changeSalary() {
		salary=45000;
	}
	
	String cname; //Data Member/State/Field
	void show() { //Member Function/Method/Behavior
		System.out.println(name+ " "+ salary+" "+cname);
	}
	void input(String n,int s,String c) { //Member Function/Method/Behavior
		name=n;
		salary=s;
		cname=c;
	}
}
public class ClassObjectEx2 {
	public static void main(String[] args) {
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		
		a.m();
		a.changeSalary();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		a.input("Cheetah Khan",10000000,"ABC");
		b.input("Yoyo Gupta",890000,"XYZ");
		c.input("Kaliya",750000000,"MNO");
		d.input("Teja Singh",740000,"PQR");
		
		a.salary=10;
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
		
		a.m();
	}
}