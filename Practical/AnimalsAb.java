package oops;

abstract class AnimalsAb 
{
	//contains abstract method
	//abstract method does not have body
	public abstract void sound();
	
	
	public void sleep()
	{
		System.out.println("animals sleeps");
	}
}
//subclass inherits AnimalsAb
class Monkey extends AnimalsAb
{
	public void sound()
	{
		System.out.println("Monkey sounds like human....");
	}	
}
class AnimalsAbMain
{
	public static void main(String[] args)
	{
		Monkey m=new Monkey();
		m.sound();
		m.sleep();
	}
}
