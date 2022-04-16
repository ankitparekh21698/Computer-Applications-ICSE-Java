/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PTMSSNG
{   
    static long missingvalue_countFreq(long arr[], int n) 
    { 
        long value=0;
        long freq[] = new long[n];
        Map<Long, Long> mp = new HashMap<>(); 
  
        // Traverse through array elements and 
        // count frequencies 
        for (int i = 0; i < n; i++) 
        { 
            if (mp.containsKey(arr[i]))  
            { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            }  
            else
            { 
                mp.put(arr[i], (long)1); 
            } 
        } 
        // Traverse through map and print frequencies 
        for (Map.Entry<Long, Long> entry : mp.entrySet()) 
        { 
            if(entry.getValue()%2!=0)
            {
               value = entry.getKey();
            }
        } 
        return value;
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out); 
		byte T;
		int N;
		String []strNums;
		
		//String[] strNums;
		try{
			//Your Solve
			T =Byte.parseByte(br.readLine());
		while(T>0)
		{
		    N = Integer.parseInt(br.readLine());
		    long x[] = new long[4*N-1];
		    long y[] = new long[4*N-1];
		    for(int i=0;i<4*N-1;i++)
		    {
		        strNums = br.readLine().split("\\s");
		        x[i] = Integer.parseInt(strNums[0]);
		        y[i] = Integer.parseInt(strNums[1]);
		    }
            out.println(missingvalue_countFreq(x,4*N-1)+" "+missingvalue_countFreq(y,4*N-1)); 
		    T--;
		}
		}
		
		catch(Exception e){
			return;
		}
	}
}