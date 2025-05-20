package decisionmakingquestions;

public class DMQues10 {

	public static void main(String[] args) {
		int a=10,b=5;
		if(a++<b-- && ++a!=--b) { // (10<5 && Second Part is not evaluated)
			System.out.println(a+b);
		}else {
			//11-5=6
			//a=12 b=5
			System.out.println(a++-++b);
		}
		//123
		System.out.println(""+a+b);
	}

}