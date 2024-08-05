package zoho;
import java.util.*;
public class SpecialArrayReversal 
{
	public String reverse(String str)
    {
        ArrayList <Character> list = new ArrayList<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            list.add(ch);
        }
        String ans="";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
           char ch = str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
            ans=ans+list.get(count);
            count++;
            }
            else
            {
                ans=ans+ch;
            }
        }
        return ans;
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		SpecialArrayReversal ob = new SpecialArrayReversal ();
		System.out.print(ob.reverse(str));
		
	}
}
