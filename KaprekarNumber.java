import java.io.*;
public class KaprekarNumber
{
    public static void main()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        int n,n1,num,ct=0,p=0,first=0,last=0,square,sum=0;
        System.out.println("Enter the number to be checked:");
        n=Integer.parseInt(br.readLine());
        n1=n;
        while(n1>0)
        {
            ct++;
            n1=n1/10;
        }
        p=(int)Math.pow(10,ct);
        square=n*n;
        first=square/p;
        last=square%p;
        sum=first+last;
        if(sum==n)
        System.out.println("It is a Kaprekar Number.");
        else
        System.out.println("NOT A KAPREKAR NUMBER.");
    }
}
        