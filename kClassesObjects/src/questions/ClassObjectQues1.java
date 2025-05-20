package questions;

class A{
	int x;

	void m() {
		System.out.println("Hi A");
	}
}

public class ClassObjectQues1 {
	public static void main(String[] args) {
		A a=new A();
		a.x=10;
		a.m(); // Hi A
		
		A b=new A();
		b.x=40;
		
		System.out.println(a.x); // 10
		System.out.println(b.x); // 40
	}
}
