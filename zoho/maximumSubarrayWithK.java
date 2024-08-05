package zoho;
import java.util.*;
public class maximumSubarrayWithK
{
	public static ArrayList<Integer> maxsubarray(int arr[],int n,int k)
	{
		ArrayList <Integer> list = new ArrayList<>();
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<k;i++)
		{
			maxi=Math.max(maxi,arr[i]);
		}
		list.add(maxi);
		for(int i=1;i<=n-k;i++)
		{
			maxi=Integer.MIN_VALUE;
			for(int j=i;j<i+k;j++)
			{
				maxi=Math.max(maxi,arr[j]);
			}
			list.add(maxi);
		}
			return list;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array size: ");
		int n = sc.nextInt();
		System.out.println("Enter array elements: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		System.out.println("Enter k value: ");
		int k = sc.nextInt();
		maximumSubarrayWithK ob = new maximumSubarrayWithK();
		System.out.print(ob.maxsubarray(arr, n, k));
	}
}
