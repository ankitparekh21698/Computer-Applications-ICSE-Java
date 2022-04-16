import java.io.*;
public class WeakarmNumber
{
    public static void main()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        int n,n1,num,ct=0,sum=0,digit;
        System.out.println("Enter the number to be checked:");
        n=Integer.parseInt(br.readLine());
        num=n1=n;
        while(num>0)
        {
            ct++;
            num=num/10;
        }
        while(n1>0)
        {
            digit=n1%10;
            sum+=(int)Math.pow(digit,ct);
            ct--;
            n1=n1/10;
        }
        if(n==sum)
        System.out.println("The number is a Weakarm Number.");
        else
        System.out.println("NOT A WEAKARM NUMBER.");
    }
}