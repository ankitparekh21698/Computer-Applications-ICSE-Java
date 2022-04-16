import java.util.*;
import java.io.*;
class Microsoft
{
    public String reverseIt(String source){
        String result="";
        for(int i=source.length()-1;i>=0;i--)
        {result+=source.charAt(i);}
        return result;
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        Microsoft m=new Microsoft();
        String s,s1,s2,s3;
        int i,j,length,ct=0,ans=0;
        System.out.println("Enter the word:");
        s=sc.nextLine();
        length=s.length();
        for(i=0;i<(int)(s.length()/2);i++)
        {
            ct++;
            j=s.length()-1-i;
            s1="";s2="";
            s1=s1+s.charAt(i);
            s2=s2+s.charAt(j);
            s3=m.reverseIt(s2);
            if(s3.compareTo(s2)==0)
            ans=ct;
        }
        System.out.println("Answer="+(ans-1));
    }}
    
        