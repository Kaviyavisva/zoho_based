package zoho;
import java.util.*;
public class diamond_pattern 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			System.out.println();
		}
		space=0;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			System.out.println();
		}
		
	}
}
