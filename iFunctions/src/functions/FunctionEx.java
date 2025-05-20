package functions;

public class FunctionEx {
	static void kuchbhi() { //Function Declaration
		System.out.println("Hello INCAPP");
		System.out.println("Hi INCAPP");
	}
	public static void main(String[] args) {
		System.out.println("Hello Main");
		kuchbhi();//Function Calling or Invocation
		kuchbhi();//Function Calling or Invocation
		System.out.println("Hi Main");
		kuchbhi();//Function Calling or Invocation
		show();//Function Calling or Invocation
		System.out.println("Bye Main");
		show();//Function Calling or Invocation
	}
	static void show() { //Function Declaration
		System.out.println("Hello Gogo");
		System.out.println("Hi Yoyo");
	}
}
