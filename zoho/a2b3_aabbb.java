package zoho;
import java.util.*;
public class a2b3_aabbb 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		int count=0;
		for(int i=1;i<str.length();i++)
		{
			char curr = str.charAt(i);
			if(curr<='9' && curr>='0')
			{
				int n = curr-'0';
				count=n;
			}
			else
			{
				for(int j=1;j<=count;j++)
				{
					System.out.print(ch);
				}
				ch=str.charAt(i);
				count=0;
			}
		}
		for(int j=1;j<=count;j++)
		{
			System.out.print(ch);
		}
		
	}
}
