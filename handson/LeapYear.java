package loops;

import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args) 
	{
		//scanner class to take input from user
		Scanner l=new Scanner(System.in);
		System.out.println("enter year");
		
		//integer input from user
		int y=l.nextInt();
		//condition 
		if (y%4==0)
		{
			System.out.println("leap year");
			
		}
		
		else if (y%100==0)
		{
			System.out.println("divisible by 100");
			
		}
		else if(y%400==0)
		{
			System.out.println("divisible by 400");
			
			
		}
		else
		{
			System.out.println("not leap year");
			
		}
		l.close();	

	}

}
