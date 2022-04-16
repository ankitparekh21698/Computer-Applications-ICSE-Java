import java.io.*;
public class ReverseOrder
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s,w=" ";
        int i,len,len2,j;
        char ch;
        System.out.print("Enter a string:");
        s=br.readLine();
        s=s.trim();
        s=s+" ";
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch!=32)
            {
                w=w+ch;
            }
            else
            {
                len2=w.length();
                for(j=len2-1;j>=0;j--)
                {
                    System.out.print(w.charAt(j));
                }
                System.out.print(" ");
                w=" ";
            }
        }
    }
}