package operators;

public class Operators1 {

	public static void main(String[] args) {
		int a=7/2;
		System.out.println(a);
		double b=7/2;
		System.out.println(b);
		double c=7/2.0;
		System.out.println(c);
		//int d=7/2.0; //error
		int d=(int)(7/2.0);
		System.out.println(d);
	}

}
