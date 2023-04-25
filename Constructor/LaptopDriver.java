package Constructor;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell", 45679, 1024);
		Laptop l2 = new Laptop(l1);
		l1.display();
		l2.display();
		
		Laptop l3 = new Laptop(l1, 256);
		l3.display();
	}
}
