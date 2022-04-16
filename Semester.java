import java.io.*;
import java.util.*;
public class Semester
{
    int a1,b1;
    Semester(int a,int b){
        a1=a; 
        b1=b;}
    public  void main()
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Scanner sc=new Scanner(System.in);
        System.out.println(a1+"    "+b1);
    }
}