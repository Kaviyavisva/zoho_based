package zoho;
import java.util.*;
public class fibo_in_list 
{
	public static ArrayList<Integer> fibo(int n)
	{
		int a=0;
		int b=1;
		ArrayList <Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		while((a+b)<=n)
		{
			int c=a+b;//5
			list.add(c);//0,1,1,2,3,5
			a=b;//3
			b=c;//5
		}
		return list;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		System.out.print(fibo(n));
		
	}
}
