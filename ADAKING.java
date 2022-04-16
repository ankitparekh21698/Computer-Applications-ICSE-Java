/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ADAKING
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
		while(in.hasNext()){
		    int t = in.nextInt();
		    while(t-->0){
		        int k=in.nextInt();
		        for(int i=0; i<8; i++){
		            for(int j=0; j<8; j++){
		                if(i==0 && j==0){
		                    System.out.print("O");
		                    k--;
		                }
		                else if(k>0){
		                    System.out.print(".");
		                    k--;
		                }
		                else{
		                    System.out.print("X");
		                }
		            }
		            System.out.println();
		        }
		    }
		}
	}
}