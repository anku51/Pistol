package Constructor;

public class Fruit {
	String name;
	int price;
	double weight;	
	Fruit(String name, int price, double weight)
	{
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	public void displayfruit()
	{
		System.out.println("Fruit name is : "+name);
		System.out.println("Fruit price is : "+ price+" Rs.");
		System.out.println("Fruit weight is : "+weight+ " Kg.");
		System.out.println("Total price is : "+price*weight+ " Rs.");
		System.out.println("====================================");
	}
	
	

}
