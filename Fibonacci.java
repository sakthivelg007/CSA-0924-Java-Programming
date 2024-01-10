import java.util.*;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number Of Values To Be Printed :");
		int n = sc.nextInt(), firstTerm = 0, secondTerm = 1,count=0;
		System.out.println("Fibonacci Series till " + n + " terms:");
		    for (int i = 1; i <= n; i++) 
		    {
		    	if(i<n) {
		    System.out.print(firstTerm + ", ");
		    int nextTerm = firstTerm + secondTerm;
		    firstTerm = secondTerm;
		    secondTerm = nextTerm;
		    count=count+firstTerm;
		    }
		    	else
		    		System.out.print(firstTerm);
		    }
		System.out.println("\nSum of Fibonacci is "+count);
	}
}