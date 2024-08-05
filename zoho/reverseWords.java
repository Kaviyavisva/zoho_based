package zoho;
import java.util.*;
public class reverseWords 
{
	String reversalWords(String S)
    {
        String arr[] = S.split("[.]");
        String rev="";
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i==0)
            	rev=rev+arr[i];
            else
            	rev=rev+arr[i]+".";
        }
        return rev;
    }
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		reverseWords ob = new reverseWords();
		System.out.print("answer: "+ob.reversalWords(str));
	}
}
