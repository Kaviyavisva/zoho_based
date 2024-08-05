package zoho;
import java.util.*;
public class pattern_1_zoho 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int num=n-1;
		for(int i=1;i<=n;i++)
		{
			num=n-1;
			int k = i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k+num;
				num--;
			}
			System.out.println();
		}
		
	}
}
