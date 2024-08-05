package zoho;
import java.util.*;
public class aabbb_a2b3 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		char ch = str.charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c==ch)
			{
				count++;
			}
			else
			{
				System.out.print(ch+""+count);
				ch=c;
				count=1;
			}
		}
		System.out.print(ch+""+count);
	}
}
