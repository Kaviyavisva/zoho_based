package zoho;
import java.util.*;
public class pattern_zoho_9 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int v1 = 1,v2=1;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=v2;k++)
			{
				System.out.print(Math.abs(k-v1));
			}
			v1++;
			v2+=2;
			System.out.println();
		}
	}
}
