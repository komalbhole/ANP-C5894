package oops;

class Shape 
{
 public String name;
 public void calculateArea()
 

{
	System.out.println("Calculating area of shape ");
}}
class Rectangle extends Shape
{

	public void calculateArea()
	{
		System.out.println("Calculating area of Rectangle ");
	}

}
class ShapeMain
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		
		r.name="quadra";
		{
			System.out.println("name is :" +r.name);
			
		}
		r.calculateArea();
	}
}