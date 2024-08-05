package zoho;
import java.util.*;
public class cross_pattern 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		int l = str.length();
		for(int i=0,j=l-1;i<l&&j>=0;i++,j--)
		{
			for(int k=0;k<l;k++)
			{
				if(i==k)
					System.out.print(str.charAt(i));
				else if((i+k)==l-1)
					System.out.print(str.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
