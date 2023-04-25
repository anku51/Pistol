package Method_Overloading;

public class Program1 {
	
	public static void sum(int x, int y) {
		System.out.println("int, int argument");
		System.out.println("Sum is : "+(x+y));
		System.out.println("================");
	}
	public static void sum(int x, double y) {
		System.out.println("int, double argument");
		System.out.println("Sum is : "+(x+y));
		System.out.println("================");
	}
	public static void sum(double x, double y) {
		System.out.println("double, double argument");
		System.out.println("Sum is : "+(x+y));
		System.out.println("================");
	}
	public static void sum(int x, int y, int z) {
		System.out.println("int, int, int argument");
		System.out.println("Sum is : "+(x+y+z));
		System.out.println("================");
	}
	public static void sum(int x, int y, double z) {
		System.out.println("int, int, double argument");
		System.out.println("Sum is : "+(x+y+z));
		System.out.println("================");
	}
	public static void sum(int x, double y, int z) {
		System.out.println("int, double, int argument");
		System.out.println("Sum is : "+(x+y+z));
		System.out.println("================");
	}
	public static void sum(double x, int y, int z) {
		System.out.println("double, int, int argument");
		System.out.println("Sum is : "+(x+y+z));
		System.out.println("================");
	}
	public static void sum(double x, double y, double z) {
		System.out.println("double, double, double argument");
		System.out.println("Sum is : "+(x+y));
		System.out.println("================");
	}
	

}
