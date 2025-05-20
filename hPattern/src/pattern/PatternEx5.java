package pattern;

public class PatternEx5 {
	public static void main(String[] args) {
		int a=5,b=4,c=1;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=b;y++) {
				System.out.print(" ");
			}
			for(int y=1;y<=c;y++) {
				System.out.print("*");
			}
			b--;
			c+=2;
			System.out.println();
		}
	}
}
