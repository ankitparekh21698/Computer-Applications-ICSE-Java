/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CRDGAME
{
	static long getSum(long n) 
        {     
        long sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
        return sum; 
    } 
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out); 
		short T;
		byte N;
		String []strNums;
		try{
			T =Short.parseShort(br.readLine());
		while(T>0)
		{
		   
		    N = Byte.parseByte(br.readLine());
		    byte points_chef=0,points_morty=0;
		    for(byte i=0;i<N;i++)
		    {
		        
		        strNums = br.readLine().split("\\s");
		        if(getSum(Long.parseLong(strNums[0]))>getSum(Long.parseLong(strNums[1])))
		          points_chef+=1;
		        else if(getSum(Long.parseLong(strNums[0]))<getSum(Long.parseLong(strNums[1])))
		          points_morty+=1;
		        else
		          {
		              points_chef+=1;
		              points_morty+=1;
		          }
		          
		    }
		    
		    if(points_chef>points_morty)
		    {out.println("0 "+points_chef);}
		    else if(points_chef<points_morty)
		    {out.println("1 "+points_morty);}
		    else
		    {out.println("2 "+points_chef);}
		    T--;
		}
		}
		
		catch(Exception e){
			return;
		}
		
	}
}
