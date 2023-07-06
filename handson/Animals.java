package oops;

class Animals
{
String name;
public void eat()
{
	System.out.println("Animal eats.. ");
	
}
}
class Dogs extends Animals 
{
public void sound()
{
	System.out.println("dog barks");
}
}
class Puppy extends Dogs
{
	public void colour()
	{
		System.out.println("colour is black or white");
		
	}
}
class AnimalsMain
{

	public static void main(String[] args) {
		// creating object of sub class 
		{
			Puppy p=new Puppy();
			//access fields and methods
			p.name="lucky";
			{
				System.out.println("name is " +p.name);
				}
			p.eat();
			p.sound();
			p.colour();
		}

	}

}
