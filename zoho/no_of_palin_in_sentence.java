package zoho;
import java.util.*;
public class no_of_palin_in_sentence 
{
	public static boolean isPalin(String str)
	{
		String rev = "";
		boolean ans = false;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
		{
			ans=true;
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		int count=0;
		String arr[] = str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String s = arr[i];
			if(isPalin(s))
			{
				count++;
			}
		}
		System.out.print(count);
	}
}
