package zoho;
import java.util.*;
public class climbing_stairs 
{
	public static int stairs(int n)
	{
		int steps[]=new int[n+1];
		steps[0]=1;
		steps[1]=1;
		for(int i=2;i<=n;i++)
		{
			steps[i]=steps[i-1]+steps[i-2];
		}
		return steps[n];
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter steps: ");
		int n = sc.nextInt();
		System.out.print(stairs(n));
		
	}
}
