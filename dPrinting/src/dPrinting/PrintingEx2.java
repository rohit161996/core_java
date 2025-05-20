package dPrinting;

public class PrintingEx2 {

	public static void main(String[] args) {
		double a=25.674;
		int b=45;
		char c='h';
		String d="Rahul";
		boolean e=true;
		System.out.printf("%f\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%c\n",c);
		System.out.printf("%s\n",a);
		System.out.printf("%b\n",e);
		
		
		System.out.printf("%f\n%d\n%c\n%s\n%b\n",a,b,c,d,e);
		System.out.format("%f\n%d\n%c\n%s\n%b\n",a,b,c,d,e);
	}

}
