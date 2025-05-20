package decisionmakingquestions;

public class DMQues11 {

	public static void main(String[] args) {
		int a=10,b=5;
		if(a++<--b) { // 10 < 4 , a=11, b=4
			System.out.println(a+b);
		}else if(--b!=a++) { // 3!=11 b=3, a=12
			// 9
			System.out.println(a-b);
		}else {
			System.out.println(a++ + ++b);
		}
		//123
		System.out.println(a+""+b);
	}

}