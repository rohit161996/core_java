package questions;

class M{
	int x=90;
	
	String y="Ram";
	
	void show() {
		x++;
		System.out.println(x+y);
	}
}
public class ClassObjectQues5 {
	public static void main(String[] args) {
		M m1=new M();
		M m2=new M();
	
		m1.show(); // x=91 y=Ram
		
		m1.show(); // x=92 y=Ram
		
		m2.show(); // x=91 y=Ram
	}
}
