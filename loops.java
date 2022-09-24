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


public class loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n  = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int x=1; x<=10; x++)
        {
         System.out.println(+n+ " x "+x+" = "+(n*x));
        }
        scanner.close();
    }
}
