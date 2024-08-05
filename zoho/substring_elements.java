package zoho;
import java.util.*;
public class substring_elements 
{
	public static boolean check(String str1,String str2)
	{
		int j=0;
		boolean ans = false;
		for(int i=0;i<str2.length();i++)
		{
			if(str2.charAt(i)==str1.charAt(j))
			{
				j++;
				if(j==str1.length())
				{
					ans = true;
				}
			}
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string1: ");
		String str1 = sc.next();
		System.out.print("Enter a string2: ");
		String str2 = sc.next();
		System.out.println(check(str1,str2));
		
		
	}
}
