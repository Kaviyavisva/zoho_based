package zoho;

import java.util.*;

public class a11b22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();        
        int count = 0;
        char temp='0';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') 
            {
                count = count * 10 + (ch - '0');
            } 
            else 
            {    
                if (count > 0) 
                {
                    for (int j = 0; j < count; j++) 
                    {
                        System.out.print(temp);
                    }
                }
                count = 0;
                temp = ch; 
            }
        }
        if (count > 0) 
        {
            for (int j = 0; j < count; j++) 
            {
                System.out.print(temp);
            }
        }
    }
}
