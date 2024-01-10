import java.util.*;
public class Leap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Date :");
		int date=sc.nextInt();
		System.out.print("Enter the Month :");
		int month=sc.nextInt();
		System.out.print("Enter the Year :");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.print("It Is A Leap Year...........!");
		}
		else if(year%4==1)
		{
			System.out.print("It Is Not A Leap Year.......!");
		}
		else
		{
			System.out.print("Invalid.....................!");
		}		
	}
}