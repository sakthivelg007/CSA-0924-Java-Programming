import java.util.*;
public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int number=sc.nextInt();
		int i,fact=1;
		sc.close();
		if(number<0)
		{
			System.out.print("INVALID INPUT");
		}
		else
		{
			for(i=1;i<=number;i++)
			{    
		    fact=fact*i;    
		    }    
			System.out.println("Factorial of "+number+" is: "+fact);
		}
	}
}