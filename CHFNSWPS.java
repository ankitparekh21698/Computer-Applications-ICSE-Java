/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHFNSWPS
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out); 
		short T;
		int N,pos_a=-1,pos_b=-1;
		long sum,value_a=-1,value_b=-1,cost=-1;
		//String[] strNums;
		try{
			//Your Solve
			T =Short.parseShort(br.readLine());
		while(T>0)
		{
		    N = Integer.parseInt(br.readLine());
            long[] a = Arrays.stream(br.readLine().split("\\s")).mapToLong(Long::parseLong).toArray();
            long[] b = Arrays.stream(br.readLine().split("\\s")).mapToLong(Long::parseLong).toArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<N-1;i++)
            {
                if(a[i]==b[i])
                {
                    cost=0;
                }
                if(a[i]==a[i+1])
                {
                    pos_a = i;
                    value_a = a[i];
                }
                if(b[i]==b[i+1])
                {
                    pos_b = i;
                    value_b = b[i];
                }
                if(pos_a!=-1 && pos_b!=-1)
                {
                    if(value_a<=value_b)
                    {
                       if(value_a<=b[pos_a+1])
                       {
                           cost = value_a;
                       }
                    }
                    else
                    {
                       if(value_b<=a[pos_b+1])
                       {
                           cost = value_b;
                       }
                    }
                }
                if(cost==-1)
                {
                if(pos_a!=-1 && pos_b==-1)
                   {
                    if(value_a<=b[pos_a+1])
                       {
                           cost = value_a;
                       }
                    }
                if(pos_a==-1 && pos_b!=-1)
                    {
                    if(value_b<=a[pos_b+1])
                       {
                           cost = value_b;
                       }
                    }
                }
            }//for ends
            out.println(cost); 
		    T--;    
        }//while ends
		}//try ends
		catch(Exception e){
			return;
		}
	}
}