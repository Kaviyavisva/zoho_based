package zoho;
import java.util.*;
public class longest_consecutive_subsequence 
{
	public static int findLongestConseqSubseq(int arr[],int n)
	{
		int count=1;
		if(arr[0]==0)
		{
			for(int i=0,j=0;i<n && j<n;i++,j++)
			{
				if(arr[i]!=j)
					break;
				else
					count++;
			}
		}
		else
		{
			for(int i=0,j=arr[0];i<n && j<=n;i++,j++)
			{
				if(arr[i]!=j)
					break;
				else
					count++;
			}
		}
		
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an array size: ");
		int n = sc.nextInt();
		System.out.print("Enter array elements:");
		int arr[] = new int[n];
		//ArrayList <Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		LinkedHashSet <Integer> set = new LinkedHashSet<>();
		for(int i=0;i<n;i++)
		{
			set.add(arr[i]);
		}
		List<Integer> list = new ArrayList<Integer>(set);
		int ans[]=new int[set.size()];
		for(int i=0;i<list.size();i++)
		{
			ans[i]=list.get(i);
		}
		longest_consecutive_subsequence ob = new longest_consecutive_subsequence ();
		System.out.print(ob.findLongestConseqSubseq(arr, n));
	}
}
