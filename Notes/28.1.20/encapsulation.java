Class encl {
	private String fullname;
	public getValue() {
		return this.fullname;
	}
	public setValue(fname) {
		this.fullname = fname;
	}
}
Class ConDemo {
	public static void main(String s[]) {
		encl e = new encl();
		e.setValue("Hello John");	
		System.out.println(e.getValue());	
	}
}