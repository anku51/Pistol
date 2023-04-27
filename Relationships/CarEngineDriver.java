package Relationships;

public class CarEngineDriver {
	public static void main(String[] args) {
		
		Car c1 = new Car("Creta", 1858678.98);
		
		System.out.println("Car object Address is : "+c1);
		System.out.println("Engine object Address is : "+c1.e);
		System.out.println("Car name is : "+c1.name);
		System.out.println("Car price is : "+c1.price);
		System.out.println("Car Engine HP is : "+c1.e.hp);
		System.out.println("Car Engine stroke is : "+c1.e.strokes);
		System.out.println("Car Engine type is : "+c1.e.type);
		
		c1.e.start();
	}

}
