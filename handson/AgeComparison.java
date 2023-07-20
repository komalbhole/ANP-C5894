package operators;

import java.util.Scanner;

/*
Q1.Write a Java program that prompts the user to enter their age.
The program should check if the age is greater than or 
equal to 18 and print "You are an adult" if true,
or "You are a minor" otherwise.
*/
public class AgeComparison {

	public static void main(String[] args) {
		// input from the user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age=sc.nextInt();
		
		//comparison operators in if condition
		if(age>=18)
		{
			//print statement 
			System.out.println("you are an Adult ");
			
		}
		else
		{
			System.out.println("you are a minor ");
		}
		sc.close();
	}

}
