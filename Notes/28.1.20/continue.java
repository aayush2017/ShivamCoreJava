import java.util.Scanner;

Class ConDemo {
	public static void main(String s[]) {
		Scanner myObj = new Scanner();
		System.out.print("Please enter your Name: ");
		String fnm = myObj.nextLine();
		
		System.out.println("Your Name is: " + fnm);
	}
}