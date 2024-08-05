package zoho;
import java.util.*;
public class hexa_to_binary 
{
	public static String hexToBinConvert(String s)
	{
		int n = Integer.parseInt(s,16);
		String ans = Integer.toBinaryString(n);
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a hexadecimal: ");
		String str = sc.next();
		System.out.println("The binary form of "+str+" is "+hexToBinConvert(str));
		
	}
}
