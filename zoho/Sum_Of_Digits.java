package zoho;
import java.util.*;
public class Sum_Of_Digits 
{
	public int addDigits(int num) 
    {
        while(num>=10)
        {
            int sum=0;
            while(num>0)
            {
            sum+=num%10;
            num/=10;
            }
            num=sum;
        }
        return num;
     }  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		Sum_Of_Digits ob = new Sum_Of_Digits();
		System.out.print(ob.addDigits(n));
	}
}
