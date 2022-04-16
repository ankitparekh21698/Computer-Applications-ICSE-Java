import java.util.*;
class exp_String
{
    public static void main()
    {int ch=0;
        System.out.println("\f");
        do{String a,b;
            int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("&&&&&&&STRING EXPERIMENT&&&&&&&");
        System.out.println("1.String Reverse Operation");
        System.out.println("2.Concatenation Operation");
        System.out.println("3.Length of the string");
        System.out.println("4.Substring Operation");
        System.out.println("5.Exit");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the string to be reversed:");
            a=sc.next();
            b=reverse(a);
            System.out.println("Reversed string:"+b);
            break;
            case 2:
            System.out.println("Enter the first string:");
            a=sc.next();
            System.out.println("Enter the second string:");
            b=sc.next();
            System.out.println("Concatenated string:"+concat(a,b));
            break;
            case 3:
            System.out.println("Enter the string:");
            a=sc.next();
            System.out.println("The length of "+a+" is "+len(a));
            break;
            case 4:
            System.out.println("Enter the string of which the substring is needed:");
            a=sc.next();
            System.out.println("Enter the start index of the substring:");
            n1=sc.nextInt();
            System.out.println("Enter the last index of the substring:");
            n2=sc.nextInt();
            System.out.println("The substring is "+sub(a,n1,n2));
            break;
            case 5:
            System.out.println("Thank you.....");
            break;
            default:
            System.out.println("Wrong choice.Retry");
        }
    }while(ch!=5);
    }
    public static String reverse(String s)
    {
        String s1="";
        char c;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--)
        {
            c=s.charAt(i);
            s1=s1+c;
        }
        return s1;
    }
    public static String concat(String s1,String s2)
    {
        return s1+s2;
    }
    public static int len(String s1)
    {
        return s1.length();
    }
    public static String sub(String s1,int x,int y)
    {
        return s1.substring(x,y);
    }   
        }