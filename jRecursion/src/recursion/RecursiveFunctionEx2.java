package recursion;

//Recursion
public class RecursiveFunctionEx2 {
	static void m1() {
		System.out.println("Incapp");
		m2();
	}
	static void m2() {
		System.out.println("India");
		m1();
	}
	public static void main(String[] args) {
		System.out.println("Hello Main");
		m1();
		System.out.println("Bye Main");
	}
}
