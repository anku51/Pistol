package Oops;

public class static_class {

	static int i = 12;
	static int j;
	static {
		System.out.println("Static block - 1"+i+"  &  "+j);
		i = test();
		i = 68;
		
	}
	public static void main(String[] args) {
		System.out.println(i+" & "+j);
		int p = test();
		System.out.println(i+" & "+j+" & "+p);
		
	}
	
	public static int test() {
		System.out.println("Test method : "+i+" & "+j);
		int j = 88;
		i = 92;
		System.out.println(i+" & "+j);
		return i+20;
	}
	
}
