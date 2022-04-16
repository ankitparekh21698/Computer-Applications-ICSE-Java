
import java.io.*;
class NumberOperations
{
 int digit,sume=0,sumo=0,sumzero=0,rev=0,n1,ct=0,i;
 void evenodd(int n)
 {
     while(n>0)
     {
         digit=n%10;
         n=n/10;
         if(digit%2==0)
         sume++;
         else
         sumo++;
        }
     System.out.println("The number of even digits are:"+sume);
     System.out.println("The number of odd digits are:"+sumo);
    }
 void reverse(int n)
 {
   n1=n;
   while(n>0)
     {
         digit=n%10;
         n=n/10;
         rev=rev*10+digit;
        }
   System.out.println("The reverse of "+n1+" is "+rev);
}
void zero(int n)
{
while(n>0)
{
digit=n%10;
n=n/10;
if(digit==0)
sumzero++;
}
System.out.println("The number of zeros in the number are:"+sumzero);
}
void primecheck(int n)
{
 for(i=1;i<=n;i++)
 {
     if(n%i==0)
     ct++;
    }
    if(ct==2)
    System.out.println(n+" is a PRIME number.");
    else
    System.out.println(n+" is a NOT a PRIME number.");
}
void factors(int n)
{
 int ct=0;
 for(i=1;i<n;i++)
 {
     if(n%i==0)
     ct++;
    }
 if(ct==1)
 System.out.println(n+" is a prime number having only '1' as the factor.");
 else
 {
     System.out.println("The factors of"+n+" are:");
     for(i=1;i<n;i++)
    {
     if(n%i==0)
     System.out.print(i+"  ");
    }System.out.println(" ");
 } }
public static void main()throws IOException
{
 InputStreamReader isr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(isr);
 NumberOperations ab=new NumberOperations();
 int n,ch,flag=0;
 do{
 do{ flag=0;   
 System.out.println("**********Numbers Operations Menu**********\n1.Even and odd digits\n2.Reverse number\n3.Number of zeros\n4.Prime number check\n5.Factors\n6.Back to MathBook menu");
 System.out.print("Enter your choice:");
 ch=Integer.parseInt(br.readLine());
 if(ch>=1 && ch<=6)
 {
 flag=1;
 System.out.print("\f");
}
 else 
 System.out.println("Wrong choice...retry...");
}while(flag!=1);
 switch(ch)
 {
     case 1:
     System.out.println("Enter your number:");
     n=Integer.parseInt(br.readLine());
     ab.evenodd(n);
     break;
     case 2:
     System.out.println("Enter your number:");
     n=Integer.parseInt(br.readLine());
     ab.reverse(n);
     break;
     case 3:
     System.out.println("Enter your number:");
     n=Integer.parseInt(br.readLine());
     ab.zero(n);
     break;
     case 4:
     System.out.println("Enter your number:");
     n=Integer.parseInt(br.readLine());
     ab.primecheck(n);
     break;
     case 5:
     System.out.println("Enter your number:");
     n=Integer.parseInt(br.readLine());
     ab.factors(n);
     break;
     case 6:
     break;
    }
    }while(ch!=6);
}
}

