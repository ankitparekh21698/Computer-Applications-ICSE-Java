import java.util.*;
public class backtracing
{
    int n;
    int [] A = new int[n];
    public void Binary(int n)
    {
        
        if(n<1)
        {
            for(int i=0;i<A.length;i++)
            {
                System.out.print(A[i]);
            }
        }
        else
        {
            A[n-1]=0;
            Binary(n-1);
            A[n-1]=1;
            Binary(n-1);
        }
    }
    public static void main()
    {
        backtracing ob= new backtracing();
        ob.Binary(4);
    }
}