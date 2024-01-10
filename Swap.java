import java.util.*;
public class Swap {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 :");
		int a = sc.nextInt();
		System.out.print("Enter Number 2 :");
		int b = sc.nextInt();
		System.out.println("Before swapping, a = " + a
						+ " and b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping, a = " + a
						+ " and b = " + b);
	}
}
