package loops;

import java.util.Scanner;

public class Divisibility
{
	//scanner class to take input from user
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value ");
		
		int d=sc.nextInt();
		//condition 
		if (d%2==0&&d%3==0)
		{
			System.out.println("divisible by 2 and 3");
		}
		
		else if (d%3==0)
		{
			System.out.println("divisible by 3");
		}
		else if (d%2==0)
		{
			System.out.println("divisible by 2");
		}
		else 
		{
			System.out.println("not divisible by 2 and 3");
		}
sc.close();
	}

}
