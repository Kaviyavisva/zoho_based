package zoho;
import java.util.*;
public class CurrencyCount 
{
	public static void calci(int amt)
	{
		int currency[]= {2000,500,200,100,50,20,10,5,2,1};
		int count[] = new int[9];
		for(int i=0;i<9;i++)
		{
			if(amt >=currency[i])
			{
				count[i]=amt/currency[i];
				amt%=currency[i];
			}
		}
		System.out.println("Currency Amount: ");
		for(int i=0;i<9;i++)
		{
			if(count[i]!=0)
			{
				System.out.println(currency[i]+":"+count[i]);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a currency: ");
		int amt = sc.nextInt();
		calci(amt);
		
	}
}
