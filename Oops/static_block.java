package Oops;

public class static_block {

	static {
		System.out.println("This is a static method - 1");
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
	}
	static {
		System.out.println("This is a static method - 2");
	}
}
