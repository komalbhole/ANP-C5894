
package oops;

class Vehicle
{ 
	public String name;
	public int year;
	
	
	public void displayInfo()
	{
		System.out.println("Brand & year of the Vehilce");
	}
}
class Car extends Vehicle 
{
	public String model; 
	
}
class SportsCar extends Car 
	
{
public String topSpeed;

	public void displayInfo ()
	{
		System.out.println("Top Speed of SportsCar");
	}

}
class VehicleMain
{
	public static void main (String[]args)
	{
		SportsCar s=new SportsCar();
		s.name="BMW";
		
		s.topSpeed="120";
		
		s.year=(2012);	
		
		s.model="old";
		
			System.out.println("Brand Name is "+s.name);
		
		 
			System.out.println("topspeed is "+s.topSpeed);
		
		 
			System.out.println("year is "+s.year);
			
			System.out.println("model is "+s.model);
		
		   s.displayInfo();
		
		
		
		
    		
		
		
	}
	
}		
		
		
    		
		
		
	
	
