package zoho;
import java.util.*;
public class base7 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Converting " +n +"to base 7 is "+Integer.toString(n,7));
	}
}
