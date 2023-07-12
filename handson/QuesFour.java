package loops;

import java.util.Scanner;

/*Write a Java program that takes an integer as input and 
checks if it is divisible by 5 and 11.
 Print "Divisible" if it is divisible by both, 
and "Not Divisible" otherwise.*/
public class QuesFour {

	public static void main(String[] args)
	{
		Scanner q=new Scanner(System.in);
		System.out.println("enter ");
		
		int x=q.nextInt();
		//condition 
		if(x%5==0 && x%11==0)
		{
			System.out.println("divisible by 5&11");
		}
		else 
		{
			System.out.println("not divisible");
		}

		q.close();
	}

}
