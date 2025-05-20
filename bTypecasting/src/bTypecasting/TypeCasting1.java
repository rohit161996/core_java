package bTypecasting;

public class TypeCasting1 {

	public static void main(String[] args) {
		int a=10;
		double b=a; //Implicit or Widening or Up-casting
		System.out.println(b);
		
		double x=10.2;
		//int y=x; //error
		int y=(int)x; //Explicit or Narrowing or Down-casting
		System.out.println(y);
	}

}
