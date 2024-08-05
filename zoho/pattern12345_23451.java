package zoho;
import java.util.*;
public class pattern12345_23451 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int num=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			if(i!=1)
			{
				num++;
				for(int k=1;k<=num;k++)
				{
					System.out.print(k+" ");
				}
			}
			System.out.println();
		}
	}
}
