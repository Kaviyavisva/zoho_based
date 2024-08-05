package zoho;
import java.util.*;
public class largestNumberFomedFromArray 
{
	public static String large(String arr[],int n)
	{
		Comparator <String> cp = (X,Y)-> (X+Y).compareTo(Y+X);
		Arrays.sort(arr,cp.reversed());
		if(arr[0]=="0")
			return "0";
		StringBuilder sb = new StringBuilder();
		for(String s:arr)
		{
			sb.append(s);
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array size: ");
		int n = sc.nextInt();
		System.out.println("Enter array elements: ");
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.next();
		largestNumberFomedFromArray ob = new largestNumberFomedFromArray ();
		System.out.print("The largest form from the given array elements is: "+ob.large(arr, n));
	}
}
