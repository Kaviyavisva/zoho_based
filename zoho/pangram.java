package zoho;
import java.util.*;
public class pangram 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String str = sc.next();
		LinkedHashSet <Character> set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		int count=0;
		for(char ch:set)
		{
			if(ch>='a' && ch<='z')
			{
				count++;
			}
		}
		if(count==26)
		{
			System.out.print("It is pangram");
		}
		else
		{
			System.out.print("It is not pangram");
		}
	}
}
