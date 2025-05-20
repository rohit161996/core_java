package pattern;

public class PatternEx9 {
	public static void main(String[] args) {
		int a=11,b=1,c=a-2;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			for(int y=1;y<=c;y++) {
				System.out.print(" ");
			}
			int y=1;
			if(x==(a/2+1)) {
				y=2;
			}
			for(;y<=b;y++) {
				System.out.print("*");
			}
			if(x<=a/2) {
				b++;
				c-=2;
			}else {
				b--;
				c+=2;
			}
			System.out.println();
		}
	}
}
