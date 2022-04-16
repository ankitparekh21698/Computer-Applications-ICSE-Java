
import java.util.*;
import java.io.*;
class iBook
{
 public static void main()throws IOException
 {
     Scanner ob=new Scanner(System.in);
     PlayBook ob1=new PlayBook();
     MathBook ob2=new MathBook();
     int ch,flag;
     do
     {
         do{
             flag=0;
             System.out.println(" |*****************************************************|               ");
             System.out.println(" |    oo    BBBBBB                         KKK    KK   |               ");
             System.out.println(" |    OO    BBB  BBB                       KKK   KK    |               ");
             System.out.println(" |          BBB   BB     OOO       OOO     KKK  KK     |               ");
             System.out.println(" |   IIII   BBBBBBB    OO   OO   OO   OO   KKKKKKK     |               ");
             System.out.println(" |   IIII   BBB   BB  OO     OO OO     OO  KKK  KKK    |               ");
             System.out.println(" |   IIII   BBB  BBB   OO   OO   OO   OO   KKK   KKK   |               ");
             System.out.println(" |   IIII   BBBBBB       OOO       OOO     KKK    KKK  |               ");
             System.out.println(" |*****************************************************|               ");
             System.out.println("       1.MathBook\n       2.PlayBook\n       3.Exit");
             System.out.print("       Enter your choice:");
             ch=ob.nextInt();
             if(ch>=1 && ch<=3)
             {
                 System.out.println("\f");
                 flag=1;
                }
             else
             {
                 System.out.println("\f");
                 System.out.println("Wrong Choice ...please retry....");
                }
            }while(flag!=1);
         switch(ch)
         {
             case 1:
             ob2.main();
             break;
             case 2:
             ob1.main();
             break;
             case 3:
             System.out.println("Thank U for using iBook .....:)");
             break;
            }}while(ch!=3);
        }
    }