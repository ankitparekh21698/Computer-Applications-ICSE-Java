
import java.util.*;
public class SPS
{
 public static void main()
 {
     Scanner x=new Scanner(System.in);
     int ch;int flag=0;
     String s;
     double ch1;
     do{
     do{flag=0;    
     System.out.println("#######STONE****PAPER****SCISSOR########");
     System.out.println("1.STONE\n2.PAPER\n3.SCISSOR\n4.Back to PlayBook menu");
     System.out.println("Enter your choice:");
     ch=x.nextInt();
     ch1=Math.random();
     if(ch>=1 && ch<=4)
     {
         flag=1;
         System.out.print("\f");
        }
     else
     System.out.println("Wrong choice player,please retry......");   
     if(ch>=1 && ch<=3)
     {
         if(ch1<=0.333333333333333)
         ch1=1;
         else if(ch1<=0.666666666666666)
         ch1=2;
         else
         ch1=3;
         if(ch1==1)
         s="STONE";
         else if(ch1==2)
         s="PAPER";
         else
         s="SCISSOR";
         System.out.println("Computer choice is "+s);
        }
     }while(flag!=1);
     switch(ch)
     {
         case 1:
         if(ch1==2)
         System.out.println("You lose.Computer wins!!!");
         else if(ch1==3)
         System.out.println("You win!!!Computer loses.");
         else
         System.out.println("Tie game.....");
         break;
         case 2:
         if(ch1==3)
         System.out.println("You lose.Computer wins!!!");
         else if(ch1==1)
         System.out.println("You win!!!Computer loses.");
         else
         System.out.println("Tie game.....");
         break;
         case 3:
         if(ch1==1)
         System.out.println("You lose.Computer wins!!!");
         else if(ch1==2)
         System.out.println("You win!!!Computer loses.");
         else
         System.out.println("Tie game.....");
         break;
         case 4:
         break;
        }}while(ch!=4);}}
