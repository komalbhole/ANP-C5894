package loops;

import java.util.Scanner;

/*Write a Java program that takes an integer as input and 
checks if it is positive or negative. 
Print "Positive" if the number is greater than 0,
 and "Negative" if it is less than 0.
*/
public class PositiveNegative {

	public static void main(String[] args) 
	{
		//scanner class to take input from user
		Scanner p=new Scanner(System.in);
		
		System.out.println("enter value ");
		
		//integer input from user
		int n=p.nextInt();
		//condition 
		if(n>0)
		{
			System.out.println("positive");
		}
		else if(n<0)
		
		{
			System.out.println("negative");
			
		}
		else
		{
			System.out.println("0");
		}
		p.close();

	}

}
