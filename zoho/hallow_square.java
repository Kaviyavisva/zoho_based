package zoho;
import java.util.*;
public class hallow_square 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2: ");
		int n2 = sc.nextInt();
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n2;j++)
			{
				if(i==1 || i==n1 || j==1 || j==n2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
