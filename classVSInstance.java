import java.util.*;
import java.io.*;

public class classVSInstance
{
    private int age;

    public classVSInstance(int initialAge)
    {
        //check on initialAge
        if(initialAge<0)
        {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
        {
            age = initialAge;
        }
    }
    public void amIOld()
    {
        //determine if person is old and print the correct statement
            if(age<13) //first condition if age <13 print -you are young
            {
                System.out.println("You are young.");
            }
            else if(age>=13 && age<18) //second condition if age greater or equal to 13 and less than 18 -you are a teenager

            {
                System.out.println("You are a teenager.");
            }
            else //third condition otherwise, -you are old!
            {
                System.out.println("You are old.");
            }
        {

        }
    }
    public void yearsPassed()
    {
        //increment number of person's age
        age = age+1;
    }
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int age = sc.nextInt();
            classVSInstance p = new classVSInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++)
            {
                p.yearsPassed();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
