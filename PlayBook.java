
import java.util.*;
class PlayBook
{
 public static void main()
 {
     Scanner ob=new Scanner(System.in);
     HandCricket ob3=new HandCricket();
     logo2 ob1=new logo2();
     TicTacToe ob2=new TicTacToe();
     SPS ob4=new SPS();
     int ch,flag=0;
     do{
         do{
             flag=0;
             ob1.main();
             System.out.println("1.Tic-Tac-Toe\n2.Hand Cricket\n3.Stone-Paper-Scissor\n4.Back to iBook menu");
             System.out.println("Enter your choice:");
             ch=ob.nextInt();
             if(ch>=1 && ch<=4)
             {
                 flag=1;
                 System.out.print("\f");
                }
             else
             {
                 System.out.print("\f");
                 System.out.println("Wrong choice...please retry");
                }
            }while(flag!=1);
         switch(ch)
         {
             case 1:
             ob2.main();
             break;
             case 2:
             ob3.main();
             break;
             case 3:
             ob4.main();
             break;
            }}while(ch!=4);
        }}