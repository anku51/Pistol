package Constructor;

public class Laptop {

	String name;
	int price;
	int hdsize;
	
	Laptop(String name, int price, int hdsize){
		this.name = name;
		this.price = price;
		this.hdsize = hdsize;
	}
	Laptop(Laptop l){
		this.name = l.name;
		this.price = l.price;
		this.hdsize = l.hdsize;
		
	}
	Laptop(Laptop l, int hdsize){
		this(l);
		this.hdsize = hdsize;
		
	}
	public void display() {
		System.out.println("Laptop name is : "+ name);
		System.out.println("Laptop price is : "+ price);
		System.out.println("Laptop hard disk size is : "+ hdsize);
		System.out.println("=====================");
	}
}
