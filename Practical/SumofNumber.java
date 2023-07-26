package loops;

import java.util.Scanner;

//program that calculates and prints the sum of all number from user input
public class SumofNumber {

	public static void main(String[] args) 
	{

		//scanner class object
		Scanner s=new Scanner(System.in);
		
		//input from user
		
       System.out.println("Enter the number of values to sum");
       
       int count=s.nextInt();
       int sum=0;
       for (int i=1;i<=count;i++)
       {
    	   System.out.println("Enter value # "+i+":");
    	   
    	   int value=s.nextInt();
    	   sum+=value;
       }
        
       System.out.println("The Sum Of All"+count+"number is:"+sum);
	
       s.close();
}
}
