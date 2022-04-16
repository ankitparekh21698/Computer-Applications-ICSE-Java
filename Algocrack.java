import java.util.*;
import java.lang.*;
import java.io.*;
class Algocrack
{
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        
        
        
        int n;
        int max=0;
        int ct=0;
        System.out.println("Enter array length:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        System.out.print("enter the "+(i+1)+" th element:");
        a[i]=sc.nextInt();
        
        System.out.println("");
        }
        for(int i=0;i<n-1;i++)
        {
            ct=0;
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[j+1])
                ct++;
                else
                break;
            }
            if(ct>max)
            max=ct;
        }
        System.out.println(max+1);
        
        
    }
}