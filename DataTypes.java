import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes
{
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int j= scan.nextInt();
        double y = scan.nextDouble();
        String str = "";
        scan.nextLine();
        str = scan.nextLine();

        System.out.println(i+j);
        System.out.println(d+y);
        System.out.println(s+str);

        scan.close();

    }
}
