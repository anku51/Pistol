package Constructor;

public class VehicleDriver {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		System.out.println("==================");
		Vehicle v2 = new Vehicle("Creta");
		System.out.println("==================");
		Vehicle v3 = new Vehicle("Creta", 2000000);
		System.out.println("==================");
		Vehicle v4 = new Vehicle("Creta", 2000000, 15.6);
		System.out.println("==================");
		Vehicle v5 = new Vehicle("Creta", 2000000, 15.6, "Z-Black");
		System.out.println("==================");
		
		 v1.display();
		 System.out.println("==================");
		 v2.display();
		 System.out.println("==================");
		 v3.display();
		 System.out.println("==================");
		 v4.display();
		 System.out.println("==================");
		 v5.display();
		 System.out.println("==================");
		 
	}
	
}
