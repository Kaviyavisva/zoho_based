package zoho;
import java.util.*;
public class pattern_zoho_2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int spaces = n-1;
		for(int i=1;i<=n;i++)
		{
			int s = i;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			spaces--;
			for(int k=1;k<=i;k++)
			{
				System.out.print(s);
				s--;
			}
			System.out.println();
		}
		
	}
}
