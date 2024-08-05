package zoho;
import java.util.*;
import java.util.regex.*;
public class password_checking 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String str = sc.nextLine();
		Pattern lower = Pattern.compile("[a-z]");//lowercase 
		Pattern upper = Pattern.compile("[A-Z]");//uppercase
		Pattern digit = Pattern.compile("[0-9]");//digit
		Pattern symbol = Pattern.compile("[^a-z A-Z 0-9]");
		Matcher lm = lower.matcher(str);
		Matcher um = upper.matcher(str);
		Matcher dm = digit.matcher(str);
		Matcher sm = symbol.matcher(str);
		//checking starts..
		int lc=0,uc=0,dc=0,syc=0;
		while(lm.find())
			lc++;
		while(um.find())
			uc++;
		while(dm.find())
			dc++;
		while(sm.find())
			syc++;
		if(str.length()>=6 && lc>0 && uc>0 && syc>0 && dc==0)
			System.out.print("Your password is Moderate");
		
		else if(str.length()>=8 && lc>0 && uc>0 && syc>0 && dc>0)
			System.out.print("Your password is Strong");

		else
			System.out.print("Your password is Weak");
	}
}
