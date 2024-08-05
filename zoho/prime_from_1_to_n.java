package zoho;
import java.util.*;
public class prime_from_1_to_n 
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
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(!isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
