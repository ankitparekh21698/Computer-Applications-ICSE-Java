
import java.util.*;
public class HandCricket
{
 public static void main()
 {
     Scanner an=new Scanner(System.in);
     int flag=0,a,sum=0,sum1=0,sum2=0,sum3=0,lead,d;
     double n1;
     int ch,n,ch1;
     int flagcheck=0;
     do{
         flag=0;sum=0;sum1=0;sum2=0;sum3=0;flagcheck=0;
       do{
        flag=0;
        System.out.println("********** HAND CRICKET **********");
        System.out.println("1.Play game\n2.Rules\n3.Back to PlayBook menu");
        System.out.println("Enter your choice:");
        ch=an.nextInt();
        if(ch>=1 && ch<=3)
        {
        flag=1;
        System.out.print("\f");
        }
        else
     System.out.println("Wrong choice ...please retry");
     }while(flag!=1);
     switch(ch)
     {
        case 1:
        do{
           flag=0;
           System.out.println("@@@@@@@@ PLAY GAME @@@@@@@@@");
           System.out.println("1.Bat first\n2.Bowl first\n3.Exit");
           ch1=an.nextInt();
           if(ch1>=1 && ch1<=3)
           {
           flag=1;
           System.out.print("\f");
           }
           else 
           System.out.println("Wrong choice..please retry");
           }while(flag!=1);
          switch(ch1)
          {
            case 1:
            System.out.println("START BATTING");
            do{
               do{
                  flag=0;
                  System.out.println("Enter your number:");
                  n=an.nextInt();
                  if(n>=1 && n<=10)
                  flag=1;
                  else 
                  System.out.println("Wrong choice..please retry");
                  }while(flag!=1);
                  n1=Math.random();
                  if(n1<=0.100000000000000)
                  d=1;
                  else if(n1<=0.200000000000000)
                  d=2;
                  else if(n1<=0.300000000000000)
                  d=3;
                  else if(n1<=0.400000000000000)
                  d=4;
                  else if(n1<=0.500000000000000)
                  d=5;
                  else if(n1<=0.600000000000000)
                  d=6;
                  else if(n1<=0.700000000000000)
                  d=7;
                  else if(n1<=0.800000000000000)
                  d=8;
                  else if(n1<=0.900000000000000)
                  d=9;
                  else 
                  d=10;
                  System.out.println("Computer number choice is "+d);
                  if(n!=d)
                  {
                   sum=sum+n;
                   System.out.println("Total Runs:"+sum);
                   }
                  else
                  {
                  System.out.println("You are OUT!!!!1st innings end.Target given by you is:"+(sum+1));
                  System.out.println("***********************************************************");
                  flagcheck=1;
                  }
                  }while(flagcheck!=1);
                  flagcheck=0;
                  System.out.println("START BOWLING");
                  do{
                         do{
                            flag=0;
                            System.out.println("Enter your number:");
                            n=an.nextInt();
                            if(n>=1 && n<=10)
                             flag=1;
                             else 
                            System.out.println("Wrong choice..please retry");
                            }while(flag!=1);
                     n1=Math.random();
                     if(n1<=0.100000000000000)
                     a=1;
                     else if(n1<=0.200000000000000)
                     a=2;
                     else if(n1<=0.300000000000000)
                     a=3;
                     else if(n1<=0.400000000000000)
                     a=4;
                     else if(n1<=0.500000000000000)
                     a=5;
                     else if(n1<=0.600000000000000)
                     a=6;
                     else if(n1<=0.700000000000000)
                     a=7;
                     else if(n1<=0.800000000000000)
                     a=8;
                     else if(n1<=0.900000000000000)
                     a=9;
                     else 
                     a=10;
                     System.out.println("Computer number choice is "+a);
                     if(a!=n)
                     {
                      sum1=sum1+a;
                      System.out.println("Computer runs score:"+sum1);
                      if(sum1>sum)
                      {
                       System.out.println("You lost.....");
                       System.out.println("*********************************************");
                       flagcheck=1;
                      }
                     }
                     else
                     {
                      System.out.println("You took the wicket!!!Total runs made by the computer is:"+sum1);
                      flagcheck=1;
                      }
                      }while(flagcheck!=1);
                     if(sum>sum1)
                     {
                      lead=sum-sum1;
                      System.out.println("You win by "+lead+" runs!!!!");
                      System.out.println("************************************************");
                     }
                     if(sum==sum1)
                     {
                     System.out.println("It is a tie game..");
                     System.out.println("**************************************************");
                    }
                     break;
            case 2:
            System.out.println("START BOWLING");
            flagcheck=0;
                do{
                        do{
                           flag=0;
                           System.out.println("Enter your number:");
                           n=an.nextInt();
                           if(n>=1 && n<=10)
                           flag=1;
                           else 
                           System.out.println("Wrong choice..please retry");
                           }while(flag!=1);
                n1=Math.random();
                if(n1<=0.100000000000000)
                a=1;
                else if(n1<=0.200000000000000)
                a=2;
                else if(n1<=0.300000000000000)
                a=3;
                else if(n1<=0.400000000000000)
                a=4;
                else if(n1<=0.500000000000000)
                a=5;
                else if(n1<=0.600000000000000)
                a=6;
                else if(n1<=0.700000000000000)
                a=7;
                else if(n1<=0.800000000000000)
                a=8;
                else if(n1<=0.900000000000000)
                a=9;
                else 
                a=10;
                System.out.println("Computer number choice is "+a);
                if(n!=a)
                {
                sum2=sum2+a;
                System.out.println("Computer runs score:"+sum2);
                }
                else
                {
                System.out.println("You took the wicket!!!!1 innings end.Target given to you is:"+(sum2+1));
                System.out.println("***********************************************************************");
                flagcheck=1;
                }
            }while(flagcheck!=1);
            flagcheck=0;
                System.out.println("START BATTING");
            do{
                   do{
                      flag=0;
                      System.out.println("Enter your number:");
                      n=an.nextInt();
                      if(n>=1 && n<=10)
                      flag=1;
                      else 
                      System.out.println("Wrong choice..please retry");
                      }while(flag!=1);
                   n1=Math.random();
                   if(n1<=0.100000000000000)
                   a=1;
                   else if(n1<=0.200000000000000)
                   a=2;
                   else if(n1<=0.300000000000000)
                   a=3;
                   else if(n1<=0.400000000000000)
                   a=4;
                   else if(n1<=0.500000000000000)
                   a=5;
                   else if(n1<=0.600000000000000)
                   a=6;
                   else if(n1<=0.700000000000000)
                   a=7;
                   else if(n1<=0.800000000000000)
                   a=8;
                   else if(n1<=0.900000000000000)
                   a=9;
                   else 
                   a=10;
                   System.out.println("Computer number choice is "+a);
                   if(a!=n)
                   {
                    sum3=sum3+n;
                    System.out.println("Total Runs:"+sum3);
                    if(sum3>sum2)
                    {
                     System.out.println("You win !!!!");
                     System.out.println("***********************************************************************");
                     flagcheck=1;
                    }
                    }
                    else
                    {
                     System.out.println("You got OUT!!!Total runs made by you is:"+sum3);
                     if(sum2>sum3)
                     {
                       System.out.println("You lost......");
                       System.out.println("***********************************************************************");
                       flagcheck=1;
                     }
                     else
                     System.out.println("Tie game......");
                     System.out.println("***********************************************************************");
                    }
                    }while(flagcheck!=1);
            break;
            case 3:
            break;
            }
            break;
            case 2:
            System.out.println("################################### RULES #########################################################");
            System.out.println("1.The number choice of the user should be between 1 to 10");
            System.out.println("2.The match is of unlimited overs,so the batting side continues to bat till it is not declared OUT.");
            System.out.println("3.The decision of getting 'OUT' depends upon the similarity of the number choices of both the sides.");
            System.out.println("4.Only 1 wicket is offered to the player and the computer.");
            break;
            case 3:
            break;
        }}while(ch!=3);}}