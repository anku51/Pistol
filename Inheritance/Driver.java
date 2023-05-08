package Inheritance;

public class Driver {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		System.out.println(v1.x);
		v1.test();
		
		Car c1 = new Car();
		System.out.println(c1.a);
		System.out.println(c1.x);
		c1.demo();
		c1.test();
		
	}

}
