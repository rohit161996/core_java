package questions;

class N{
	int x=90;
	
	String y="Ram";
	
	void m(int a) {
		x=a;
		y=y+x;
	}
	
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectQues6 {
	public static void main(String[] args) {
		N m1=new N();
		N m2=new N();
		m1.m(15); // x = 15 y = Ram15
		m2.m(10); // x = 10 y = Ram10
		m1.show();// 15Ram15
		m2.show();// 10Ram10
	}
}