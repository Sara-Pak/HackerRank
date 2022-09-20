package HelloWorld;
import java.io.*;
import java.util.*;

public class HelloWorld
{
    public static void main (String[] arg)
    {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World.");
        input = sc.nextLine();
        System.out.println(input);
        sc.close();

    }
}
