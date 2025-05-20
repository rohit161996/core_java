package typesofoperators;

public class BitwiseOperatorEx {

	public static void main(String[] args) {
		int a=40,b=12;
		int r;
		r=a&b;
		System.out.println(r);
		r=a|b;
		System.out.println(r);
		r=a^b;
		System.out.println(r);
		r=a>>2;
		System.out.println(r);
		r=a<<2;
		System.out.println(r);
		r=~a;
		System.out.println(r);
	}

}
