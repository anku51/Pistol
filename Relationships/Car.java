package Relationships;

public class Car {
	String name;
	double price;
	
	Engine e = new Engine(1056, 8, "Diesel");
	
	Car(){
		
	}
	Car(String name, double price){
		this.name = name;
		this.price = price;
		
	}

}
