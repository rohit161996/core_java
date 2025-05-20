package decisionmakingquestions;

public class DMQues08 {

	public static void main(String[] args) {
		int a=10,b=5;
		if(--a*b-- >a--+--b) // (9*5 > 9+3)
		{ 
			// a=8
			System.out.println("if"+a--);
		}else {
			// a=8
			System.out.println("else"+a++);
		}
		// a=7 b=3
		System.out.println(""+a--+b--);
		System.out.println(a+b);
	}

}