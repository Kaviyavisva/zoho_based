package zoho;
import java.util.*;
public class MiddlePattern 
{
	void printPattern(String s)
	{
	    int l = s.length();
	    int summa=l/2;
	    String first=s.substring(0,summa);
	    String last=s.substring(summa,l);
        String full=last+first;
        for(int i=0;i<last.length();i++)
        {
            String sub = last.substring(0,i+1);
            System.out.print(sub+"$"+" ");
        }
        int len=l-last.length();
        for(int i=len+1;i<full.length();i++)
        {
            String sub = full.substring(0,i+1);
            System.out.print(sub+"$"+" ");
        }
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		MiddlePattern ob = new MiddlePattern ();
		ob.printPattern(str);
	}
}
