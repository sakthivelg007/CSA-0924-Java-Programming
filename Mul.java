import java.util.*;
public class Mul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number :");
		int num = sc.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d X %d = %d \n", num, i, num * i);
        }

	}

}
