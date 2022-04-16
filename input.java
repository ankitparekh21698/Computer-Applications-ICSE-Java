import java.util.*;
public class input 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,x,i;
        
        System.out.println("Input:");
        n=sc.nextInt();
        x=sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(x);
        System.out.println(n);
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+",");
        }
    }
}
        