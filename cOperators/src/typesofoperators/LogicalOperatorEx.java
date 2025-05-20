package typesofoperators;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		int a=10,b=5;
		boolean c=a++<--b && ++a!=b--;
//		boolean c=a++>--b && ++a==b--;
//		boolean c=a++<--b || ++a!=b--;
//		boolean c=a++>--b || ++a!=b--;
//		boolean c=a++<b-- && ++a>--b || a++!=b--; //(a++<b-- && ++a>--b) || a++!=b--
//		boolean c=a++<b-- && ++a>--b && a++!=b--; //(a++<b-- && ++a>--b) && a++!=b--
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
