//Given two arrays arr1[] and arr2[], the task is to find the number of 
//elements in the union between these two arrays.
//The Union of the two arrays can be defined as the set containing 
//distinct elements from both arrays. 
package zoho;
import java.util.*;
public class find_its_union 
{
	public static int doUnion(int arr1[], int arr2[]) 
    {
        LinkedHashSet <Integer> set = new LinkedHashSet<>();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            list.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            list.add(arr2[i]);
        }
        //1 2 3 4 5 1 2 3
        for(int i=0;i<list.size();i++)
        {
            set.add(list.get(i));
        }
        return set.size();
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st array: ");
		int m = sc.nextInt();
		//first array
		System.out.println("Enter elements of array 1: ");
		int arr1[] = new int[m];
		for(int i=0;i<m;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter size of 2nd array: ");
		int n = sc.nextInt();
		//second array
		System.out.println("Enter elements of array 2: ");
		int arr2[] = new int[n];
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		find_its_union obj = new find_its_union();
		System.out.print(obj.doUnion(arr1, arr2));
	}
}
