package zoho;
import java.util.*;
public class make_a_distinct_digit_array 
{
	public int[] common_digits(int[] nums)
    {
        String str = "";
		LinkedHashSet <Integer> set = new LinkedHashSet<>();
		ArrayList <Integer> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++)
		{
			str+=nums[i];
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
		Arrays.sort(ans);
		return ans;
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		make_a_distinct_digit_array ob = new make_a_distinct_digit_array();
		int ans[] = ob.common_digits(arr);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}
