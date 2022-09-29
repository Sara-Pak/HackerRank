import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class binaryNumbers {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int count = 0; int max=0;


        while(n>0)
        {
            if(n%2==1)
            {
                count++;
                if(count>=max)
                {
                    max=count;
                }
            }
            else
            {
                count=0;
            }
            n=n/2;
        }
        System.out.println(max);
    }

}
