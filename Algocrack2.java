import java.util.*;
import java.lang.*;
import java.io.*;
class Algocrack2
{
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        
        
        
        int n;
        
        int suml=0,sumr=0;
        System.out.println("Enter array length:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        System.out.print("enter the "+(i+1)+" th element:");
        a[i]=sc.nextInt();
        
        System.out.println("");
        }
        for(int i=0;i<n;i++)
        {
            suml=sumr=0;
            for(int j=0;j<i;j++)
            {
                suml+=a[j];
            }
            for(int j=i;j<n;j++)
            {
                sumr+=a[j];
            }
            if(suml==sumr)
            System.out.println(a[i]);
        }
        
        
        
    }
}