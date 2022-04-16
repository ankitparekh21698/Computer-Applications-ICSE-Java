/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFSTR1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out); 
		byte T;
		int N;
		long sum;
		//String[] strNums;
		try{
			//Your Solve
			T =Byte.parseByte(br.readLine());
		while(T>0)
		{
		    N = Integer.parseInt(br.readLine());
		    //int s[]=new int[N];
		    //strNums = br.readLine().split("\\s");
            //for(int i=0; i<strNums.length; i++) {
            //s[i] = Integer.parseInt(strNums[i]);}
            
            long[] s = Arrays.stream(br.readLine().split("\\s")).mapToLong(Long::parseLong).toArray();
            sum=0;
            for(int i=0;i<s.length-1;i++)
            {
               sum+=Math.abs(s[i+1]-s[i])-1;
            }
            out.println(sum); 
		    T--;
		}
		}
		
		catch(Exception e){
			return;
		}
	}
}