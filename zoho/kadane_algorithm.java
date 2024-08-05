package zoho;
import java.util.*;
public class kadane_algorithm 
{
	int maxSubarraySum(int[] arr) 
    {
        int msf = Integer.MIN_VALUE;
        int men=0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            men+=arr[i];
            if(men<arr[i])
            {
                men=arr[i];
            }
            if(msf<men)
            {
                msf=men;
            }
        }
        return msf;
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		kadane_algorithm ob = new kadane_algorithm ();
		System.out.print(ob.maxSubarraySum(arr));
	}
}
