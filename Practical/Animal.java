package oops;
//example of single level inheritance
//super class or base class or parent class
class Animal {
	//fields & methods
	public String name;
	public void eat()
	{
		System.out.println("Animal Eats...");
		
	}
}
//inherit from Animal
class Dog extends Animal
{
	//field $ methods of Animal class
	//field $ methods of Dog class
	public void sound()
	{ 
		System.out.println("Dog barks");
	}
}
class AnimalMain
{
	public static void main(String[] args)
	{
		//creating object of subclass
		Dog d=new Dog();
		//access fields and methods
		d.name="cookie";
		{
		System.out.println("name is " +d.name);
		}
		d.eat();
		d.sound();
		
	}
}
