package bTypecasting;

public class TypeCasting2 {

	public static void main(String[] args) {
		System.out.println(24);//Integer Literals are ByDefault int
		System.out.println(12.4);//Floating Point Literals are ByDefault double
		
		//float a=6.2;//error
		float a=(float)6.2;
		float b=6.2f;
		
		System.out.println(a);
		System.out.println(b);
		
		double x=12.3;
		double y=12.3d;

		System.out.println(x);
		System.out.println(y);
		
		//long z=10;
		//long z=10000000000;//error
		long z=10000000000L;
		System.out.println(z);
	}

}
