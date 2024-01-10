import java.util.*;
public class m_and_n
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int i,m1=0,n1=0,sum1=0,diff1=0,m2=0,n2=0;int[] arr=new int [size];
		for(i=0;i<size;i++)
		{
			System.out.println("Enter Element "+(i+1));
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Given number in array format\n"+Arrays.toString(arr));
		System.out.println("Enter mth number");
		int m=sc.nextInt();
		System.out.println("Enter nth number");
		int n=sc.nextInt();
		n1=n-1;
		n2=arr[n1];
		System.out.println("Nth Element :"+arr[n1]);
		m1=size-m;
		m2=arr[m1];
		System.out.println("Mth Element :"+arr[m1]);
		sum1=m2+n2;
		diff1=m2-n2;
		System.out.println("sum of mth and nth element ="+sum1);
		System.out.println("diff of mth and nth element ="+diff1);
		}
		
	}
