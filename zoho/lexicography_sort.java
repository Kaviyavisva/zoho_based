package zoho;
import java.util.*;
public class lexicography_sort 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		String arr[] = new String [n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
