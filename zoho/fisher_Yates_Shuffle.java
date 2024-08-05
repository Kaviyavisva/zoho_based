package zoho;
import java.util.*;
import java.util.random.*;
public class fisher_Yates_Shuffle 
{
	public static void shuffle(int arr[])
	{
		Random r = new Random();
		for(int i=arr.length-1;i>0;i--)
		{
			int j = r.nextInt(i+1);//5
			int temp = arr[i];//7
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.print(Arrays.toString(arr));
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		shuffle(arr);
	}
}
