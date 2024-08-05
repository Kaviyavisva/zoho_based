package zoho;
import java.util.*;
public class Binary_To_Hexa 
{
	public static String BinToHexaConvert(String s)
	{
		int n = Integer.parseInt(s,2);
		String ans = Integer.toHexString(n);
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary String");
		String str = sc.next();
		System.out.println("The hexa form of given binary is: "+BinToHexaConvert(str));
	}
}
