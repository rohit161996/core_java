package switchStmnt;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		switch("Ram") {
			case "Rohan":
				System.out.println("Hello");
				break;
			case "Ram":
			//case 2://error
				System.out.println("Hi");
				break;
			case "Mohan":
				System.out.println("Bye");
				break;
			default:
				System.out.println("Invalid value");
		}
		System.out.println("Thanks for using APP");
	}

}
