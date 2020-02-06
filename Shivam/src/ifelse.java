
public class ifelse {
	public static void main(String s[]) {
		int a, b, c;
		a = 1000;
		b = 2000;
		c = 10000;

		if(a > b) {
			if(a > c)
			System.out.println("A Big");
		}else if(b>a && b > c) {
			System.out.println("B Big");
		} else if(c>a && c > b) {
			System.out.println("C Big");
		} else {
			System.out.println("All are Equal");
		}
	}
}
