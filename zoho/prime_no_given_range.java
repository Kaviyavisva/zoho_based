package zoho;
import java.util.*;
public class prime_no_given_range 
{
	public static boolean isPrime(int num)
	{
		int m = num/2;
		boolean ans = false;
		for(int i=2;i<=m;i++)
		{
			if(num%i==0)
			{
				ans=true;
				break;
			}
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int n2 = sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			if(!isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}
