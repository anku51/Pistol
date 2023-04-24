package Constructor; //Constructor Chaining & Constructor overloading


public class Vehicle {
	String name;
	int price;
	double mileage;
	String color;
	
	Vehicle(){
		System.out.println("NO argument constructor");
	}

	Vehicle(String name){
		this();
		System.out.println("String arg Constructor");
		this.name = name;
	}
	Vehicle(String name, int price){
		this(name);
		System.out.println("String int arg Constructor");
		this.price = price;
	}
	Vehicle(String name,int price, double mileage){
		this(name, price);
		System.out.println("String int double Constructor");
		this.mileage = mileage;
	}
	Vehicle(String name,int price, double mileage, String color){
		this(name, price, mileage);
		System.out.println("String int double String Constructor");
		this.color = color;
	}
	public void display(){
		System.out.println("Car name is : "+ name);
		System.out.println("car price is : "+ price);
		System.out.println("car mileage is : "+ mileage);
		System.out.println("Car color is : "+ color);
		
	}
}
