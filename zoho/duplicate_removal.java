package zoho;
import java.util.*;
public class duplicate_removal 
{
	public static int[] duplicate(int arr[])
	{
		String str = "";
		LinkedHashSet <Integer> set = new LinkedHashSet<>();
		ArrayList <Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			str+=arr[i];
		}
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int x = ch-'0';
			set.add(x);
		}
		for(int i:set)
		{
			list.add(i);
		}
		int ans[] = new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			ans[i]=list.get(i);
		}
		return ans;
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Enter array elements: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res [] = duplicate(arr);
		Arrays.sort(res);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
}
