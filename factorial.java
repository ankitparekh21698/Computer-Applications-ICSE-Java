import java.util.*;
public class factorial
{
    public static int fact(int n)
    {
        if ( n == 1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the no.:");
        n=sc.nextInt();
        System.out.println(" Factorial of "+(n)+" is "+fact(n));
    }
}