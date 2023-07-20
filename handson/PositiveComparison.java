package operators;

import java.util.Scanner;

//Write a Java program that takes an integer as user input and checks if it is a positive number.

public class PositiveComparison {

	public static void main(String[] args) {
		// input from the user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		//comparison opetators
		boolean positive=num>0;
		//boolean negative=num<0;
		//boolean neutral=num==0;
		
		//print statements
		System.out.println("Is the number positive? "+positive);
	    //System.out.println("Is the number negative? "+negative);
	    //System.out.println("Is the number neutral? "+neutral);
	    
	    sc.close();
		

	}

}
