Class ConDemo {
	public static void main(String s[]) {
		for(int i=1; i<=10; i++) {
			if (i<=5) {
				continue;
				System.out.println(i);
			} else {
				break;
				System.out.println("Break");
			}
		}
		
	}
}