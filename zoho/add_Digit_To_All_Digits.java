package zoho;
import java.util.*;
public class add_Digit_To_All_Digits 
{
	public static int numsize(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Enter a digit: ");
		int temp=n;
		int d = sc.nextInt();
		int count = numsize(n);
		int arr[] =  new int[count];
		for(int i=count-1;i>=0;i--)
		{
			arr[i]=n%10;
			n/=10;
		}
		String res="";
		for(int i=0;i<count;i++)
		{
			int ans=arr[i]+d;
			res=res+ans;
		}
		System.out.print(res);
	}
}
