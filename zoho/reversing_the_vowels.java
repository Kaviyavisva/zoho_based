package zoho;
import java.util.*;
public class reversing_the_vowels 
{
	public static boolean isvowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
	String modify (String s)
    {
        ArrayList <Character> list = new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(isvowel(ch))
            list.add(ch);
        }
        String str="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(isvowel(ch))
            {
                str=str+list.get(count);
                count++;
            }
            else
            {
                str=str+ch;
            }
        }
        return str;
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		reversing_the_vowels ob = new reversing_the_vowels ();
		System.out.println("After reversing the vowels: "+ob.modify(str));
	}
}
