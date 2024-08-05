package zoho;
import java.util.*;
public class move_all_zeros_to_end_of_array 
{
	void pushZerosToEnd(int[] arr, int n) 
    {
        int count=0;
        int zero=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)//1 
                arr[count++]=arr[i];//1 count=1,1,5, count=2,3 count=3  0,1,2 
            else
            zero++;//2
        }
        while(count<n)//3<5 4<5 5<5
        {
            arr[count++]=0;
        }
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
		move_all_zeros_to_end_of_array  ob = new move_all_zeros_to_end_of_array ();
		 ob.pushZerosToEnd(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
