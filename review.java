import java.io.*;
import java.util.*;

public class review
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner (System.in);

        int time  = scan.nextInt();
        scan.nextLine();

        while(time>0)
        {
            String str = scan.nextLine();
            StringBuilder evenStr = new StringBuilder();
            StringBuilder oddStr = new StringBuilder();

            char arr [] = str.toCharArray();
            for(int x=0; x<str.length(); x++)
            {
                if(x%2==0)
                {
                    evenStr.append(arr[x]);
                }
                else
                {
                    oddStr.append(arr[x]);
                }
            }
            evenStr.append(" ");
            evenStr.append(oddStr);
            System.out.println(evenStr);
            time--;
        }
    }
}
