package zoho;
import java.util.*;
public class duplicatesElementsArray 
{
	public static int[] duplicate(int[]arr)
    {
        Set<Integer> set = new TreeSet<>();
        for(int k:arr)
        {
        int last=0;
        while(k!=0)
        {
            last=k%10;
            set.add(last);
            k/=10;
        }
        }
        int res[]=new int[set.size()];
        int i=0;
        for(int k:set)
        {
            res[i++]=k;
        }
        return res;     
    }
public static void main(String[] args) {	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	   // duplicatesElementsArray m = new duplicatesElementsArray();
	   int arr1[] = duplicate(arr);
	   for(int i=0;i<arr1.length;i++)
	   {
	    System.out.print(arr1[i]);
	   }

	}
}
