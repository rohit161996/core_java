package literals;

public class FloatingPointLiteral {

	public static void main(String[] args) {
		double a=12543.65471; //Simple FloatingPoint Literal
		double b=1.254365471e+4; //Exponential FloatingPoint Literal
		System.out.println(a);
		System.out.println(b); 

		double x=012.3;
		System.out.println(x);
		
		double y=1_258.3_6_78;
		//double y=_1258.3678_; //error
		//double y=1258_._3678; //error
		System.out.println(y);
	}

}