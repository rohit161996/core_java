package decisionmakingquestions;

public class DMQues07 {

	public static void main(String[] args) {
		int a=10,b=5;
		if(a++>++a) // (10 > 11) 
		{
			System.out.println("if" + a);
			System.out.println(a--);
		}else {
			System.out.println("else" + a);
			System.out.println(a++);
		}
		System.out.println(""+a+b--);
	}

}