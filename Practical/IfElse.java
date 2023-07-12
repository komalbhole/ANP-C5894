package loops;
import java.util.*;
public class IfElse {

	public static void main(String[] args) {
		//scanner class to take input from user 
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value ");
		//integer input from user
		int a =s.nextInt();
		
		 //condition 
		
		if(a>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");
		}

		s.close();
	}

}
