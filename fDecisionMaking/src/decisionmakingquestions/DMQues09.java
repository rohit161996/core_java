package decisionmakingquestions;

public class DMQues09 {

	public static void main(String[] args) {
		int a=10,b=5;
		if(--a!=b--) { // 9 != 5
			// 9 + 3 = 12
			System.out.println(a--+--b);
		}else {
			System.out.println(a++-++b);
		}
		// 83
		System.out.println(""+a+b);
	}

}