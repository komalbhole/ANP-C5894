package loops;

import java.util.Scanner;

public class SwitchCaseExample
{

	public static void main(String[] args) 
	{
		// input from the user
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a DAY(1-7): ");
		int day=sc.nextInt();
		 
		String dayname;
		//switch case
		switch(day)
		{
		case 1:
		dayname="Monday";
		//Break is used jump out of the loop
		break;
		
		case 2:
		dayname="Tuesday";
		//Break is used jump out of the loop
		break;
		
		case 3:
		dayname="Wednesday";
		//Break is used jump out of the loop
		break;
			
		case 4:
		dayname="thursday";
		//Break is used jump out of the loop
		break;
			
		case 5:
		dayname="friday";
		//Break is used jump out of the loop
		break;
			
		case 6:
		dayname="saturday";
		//Break is used jump out of the loop
		break;
			
		case 7:
		dayname="sunday";
		//Break is used jump out of the loop
		break;
		
		default:
		dayname="invalid day";
		//Break is used jump out of the loop
		break;
		}
         System.out.println("the day is "+dayname);
         
         sc.close();
	}

}
