package questions;

class P{
	int x=90;
	
	String y="Ram";
	
	void m(int a) {
		show();
		x=a;
		y=x+"Hi"+y;
	}
	
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectQues7 {
	public static void main(String[] args) {
		P m1=new P(); // x=90 y=Ram
		P m2=new P(); // x=90 y=Ram
		m1.m(15); // x=15 y=15HiRam
		m2.m(10); // x=10 y=10HiRam
		m1.show(); // 1515HiRam
		m2.show(); // 1010HiRam
		
		// Output
		// 90Ram
		// 90Ram
		// 1515HiRam
		// 1010HiRam
		
	}
}