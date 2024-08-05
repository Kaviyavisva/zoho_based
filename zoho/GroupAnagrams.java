package zoho;
import java.util.*;
public class GroupAnagrams 
{
	public static List<List<String>> group (String arr[])
	{
		Map <String,List<String>> map = new HashMap<>();
		for(String s:arr)
		{
			char ch[] = s.toCharArray();
			Arrays.sort(ch);
			String str = String.valueOf(ch);
			if(!map.containsKey(str))
			{
				map.put(str, new ArrayList<>());
			}
			map.get(str).add(s);
		}
		return new ArrayList<> (map.values());
		
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		
	}
}
