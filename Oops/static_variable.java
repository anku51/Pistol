package Oops;

public class static_variable {

	static int a = 214;
	public static void main(String[] args) {
		System.out.println(a);
		a = 145;
		System.out.println(a);
		int a = 67;
		System.out.println(a);
		a = 88;
		System.out.println(a);
		Program2.a = 234;
		System.out.println(a);
		System.out.println(Program2.a);
		System.out.println(Static_Keyword.a);
	}
}
