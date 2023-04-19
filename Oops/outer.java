package Oops;

public class outer {
	static int a = 24;
	public static void test() {
		System.out.println("Outer class test method");
		System.out.println(a);
	}

public static class inner{
	static int b = 46;
	public static void demo() {
		System.out.println("Inner class demo method");
		System.out.println(b);
	}
	
}

}
