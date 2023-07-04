package oops;

class Encapsulation 
{
	private String name;
	private int age;
	
	//getName method
	public String getName() {
		return name;
	}
	//setName method
	public void setName(String name) {
		this.name = name;
	}
	//getAge method
	public int getAge() {
		return age;
	}
	//setAge method
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
class Main
{
	public static void main(String[]args)
	{
		//Creating instance of class Encapsulation
		Encapsulation e=new Encapsulation();
		//setting value
		e.setName("komal");
		e.setAge(23);
		
		//print values
		System.out.println("name is:"+ e.getName());
		System.out.println("Age is:" + e.getAge());
		
	}
	}


	

