package zoho;
import java.util.*;
public class desc_asc 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.print("Enter array elements: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList <Integer> oddlist = new ArrayList <>();
		ArrayList <Integer> evenlist = new ArrayList <>();
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				evenlist.add(arr[i]);
			else
				oddlist.add(arr[i]);
		}
		Collections.sort(evenlist);
		Collections.sort(oddlist);
		for(int i=oddlist.size()-1;i>=0;i--)
		{
			System.out.print(oddlist.get(i)+" ");
		}
		for(int i:evenlist)
			System.out.print(i+" ");
	}
}
