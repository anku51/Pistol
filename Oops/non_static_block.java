package Oops;

public class non_static_block {
	{
		System.out.println("Object is created");
		System.out.println("Non Static block - 1");
		
	}
	static {
		System.out.println("static block - 1");
	}
public static void main(String[] args) {
	System.out.println("Main method");
	System.out.println("=============");
	non_static_block n1 = new non_static_block();
	System.out.println("================");
	non_static_block n2 = new non_static_block();
	System.out.println("================");
}
{
	System.out.println("Non Static block - 2");
}
}
