class demo4 {
	public void display() {
		System.out.println("Hello From Function");
	}
	public void print(String a) {
		System.out.println("Hello " + a);
	}
}
public class funExam {
	public static void main(String s[]) {
		demo4 d = new demo4();
		d.print("Shivam");
	}
}
