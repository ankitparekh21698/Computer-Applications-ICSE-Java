
import java.util.*;
public class TicTacToe
{
 public static void main()
 {
     Scanner ti=new Scanner(System.in);
     String a[]={" "," "," "," "," "," "," "," "," "};
     int pf[]={0,0,0,0,0,0,0,0,0};
     int ct=1,flag,flag2,flag1,ch,flagcheck=0,i,pos;
     String c;
     do{flag2=0;
     do{
         flag1=0;
         System.out.println("*************************************************************************************");
         System.out.println("   TTTTTTTT II   CCCC       TTTTTTTT    AA      CCCC      TTTTTTTT   OO     eeee     ");
         System.out.println("      TT    II  CC      **     TT      A  A    CC     **     TT    OO  OO  eeeeeee   ");
         System.out.println("      TT    II  CC      **     TT     AAAAAA   CC     **     TT    OO  OO  ee        ");
         System.out.println("      TT    II   CCCC          TT    AAA  AAA   CCCC         TT      OO     eeeee    ");
         System.out.println("1.Play Game\n2.Rules\n3.Description\n4.Back to PlayBook menu");
         System.out.println("Enter your choice :");
         ch=ti.nextInt();
         if(ch>=1 && ch<=4)
         {
         flag1=1;
         System.out.print("\f");
         }
         else
         System.out.println("Wrong choice....retry");
        }while(flag1!=1);
       switch(ch)
       {
           case 1:
           //reinitialisation
           ct=1;
           flagcheck=0;
          a[0]=" ";
          a[1]=" ";
          a[2]=" ";
          a[3]=" ";
          a[4]=" ";
          a[5]=" ";
          a[6]=" ";
          a[7]=" ";
          a[8]=" ";
          pf[0]=0;
          pf[1]=0;
          pf[2]=0;
          pf[3]=0;
          pf[4]=0;
          pf[5]=0;
          pf[6]=0;
          pf[7]=0;
          pf[8]=0;//reinitialisation ends
          System.out.println("********** PLAY GAME ***********");
          System.out.println("Grid positions:");
          System.out.println("_1_|_2_|_3_");
          System.out.println("_4_|_5_|_6_");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("     |     |      ");
          System.out.println("_____|_____|_____ ");
          System.out.println("     |     |      ");
          System.out.println("_____|_____|_____ ");
          System.out.println("     |     |      ");
          System.out.println("     |     |      ");
          while(flagcheck!=1)
          {
           if(ct%2==0)
          {
             i=2;
             c="O";
            }
          else
          {
             i=1;
             c="X";
            }
          do{
             flag=0;
             System.out.println("Player "+i+",enter your position choice:");
             pos=ti.nextInt();
             if(pos>=1 && pos<=9)
             flag=1;
             else
             {
                 System.out.println("Wrong choice...");
                }
            }while(flag!=1);
            System.out.print("\f");
            if(pf[pos-1]==0)
            {
                ct++;
                pf[pos-1]=1;
                a[pos-1]=c;
                System.out.println("********** PLAY GAME ***********"); 
                System.out.println("_1_|_2_|_3_");
                System.out.println("_4_|_5_|_6_");
                System.out.println(" 7 | 8 | 9 ");
                System.out.println("  "+a[0]+"  |  "+a[1]+"  |  "+a[2]+"  ");
                System.out.println("_____|_____|_____ ");
                System.out.println("  "+a[3]+"  |  "+a[4]+"  |  "+a[5]+"  ");
                System.out.println("_____|_____|_____ ");
                System.out.println("  "+a[6]+"  |  "+a[7]+"  |  "+a[8]+"  ");
                System.out.println("     |     |      ");
                if(ct>=6)
                {   
                    if(pos-1==4)
                    {
                        if(a[0]==a[4] && a[4]==a[8] || a[2]==a[4] && a[4]==a[6] || a[1]==a[4] && a[4]==a[7] || a[3]==a[4] && a[4]==a[5])
                        {
                            flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }
                    if(pos-1==0)
                    { 
                        if(a[0]==a[3] && a[3]==a[6] || a[0]==a[1] && a[1]==a[2] || a[0]==a[4] && a[4]==a[8])
                        {
                          flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }
                    if(pos-1==2)
                    { 
                        if(a[2]==a[4] && a[4]==a[6] || a[2]==a[5] && a[5]==a[8] || a[2]==a[1] && a[1]==a[0])
                        {
                          flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }
                    if(pos-1==6)
                    { 
                        if(a[6]==a[4] && a[4]==a[2] || a[6]==a[3] && a[3]==a[0] || a[6]==a[7] && a[7]==a[8])
                        {
                          flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }
                    if(pos-1==8)
                    { 
                        if(a[8]==a[4] && a[4]==a[0] || a[8]==a[5] && a[5]==a[2] || a[8]==a[7] && a[7]==a[6])
                        {
                          flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }
                    if(pos-1==1)
                    { 
                        if(a[1]==a[4] && a[4]==a[7] || a[1]==a[0] && a[0]==a[2])
                        {
                          flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }
                    if(pos-1==3)
                    { 
                        if(a[0]==a[3] && a[3]==a[6] || a[3]==a[4] && a[4]==a[5])
                        {
                          flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }    
                    if(pos-1==5)
                    { 
                        if(a[5]==a[4] && a[4]==a[3] || a[5]==a[2] && a[2]==a[8])
                        {
                          flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }    
                    if(pos-1==7)
                    { 
                        if(a[6]==a[7] && a[7]==a[8] || a[1]==a[4] && a[4]==a[7])
                        {
                          flagcheck=1;
                            System.out.println("Player "+i+" is the winner!!!!");
                        }
                    }    
                }}
                else 
                {
                System.out.println("The position entered is already occupied.Please retry...");
                System.out.println("********** PLAY GAME ***********"); 
                System.out.println("_1_|_2_|_3_");
                System.out.println("_4_|_5_|_6_");
                System.out.println(" 7 | 8 | 9 ");
                System.out.println("  "+a[0]+"  |  "+a[1]+"  |  "+a[2]+"  ");
                System.out.println("_____|_____|_____ ");
                System.out.println("  "+a[3]+"  |  "+a[4]+"  |  "+a[5]+"  ");
                System.out.println("_____|_____|_____ ");
                System.out.println("  "+a[6]+"  |  "+a[7]+"  |  "+a[8]+"  ");
                System.out.println("     |     |      ");
                }
                if(ct==10)
                {
                    if(flagcheck!=1)
                    {
                    flagcheck=1;
                    System.out.println("Tie game....");
                }
                 }
            }
            break;
            case 2:
            System.out.println("*************** RULES *********************");
            System.out.println("1.Tic Tac Toe is a double player symbol game.");
            System.out.println("2.The players are recommended to take their appropriate turns while playing.");
            System.out.println("3.The winner is required to make a line of 3 of his/her symbol(X or O).");
            System.out.println("4.The line can be made diagonal wise,vertical or horizontal.");
            System.out.println("5.The player who makes his/her line first,he/she becomes the winner.");
            System.out.println("6.If none of the players are able to complete their lines,the result of the game is a tie.");
            System.out.println("7.The players can obstruct the formation of the opponent's line.");
            break;
            case 3:
            System.out.println("************** DESCRIPTION **********************************************************************");
            System.out.println("HISTORY:");
            System.out.println("    ");
            System.out.println("An early variant of Tic-tac-toe was played in the Roman Empire, around the first century BC.\n It was called Terni Lapilli and instead of having any number of pieces, each player only had three,\n thus they had to move them around to empty spaces to keep playing.\n The game's grid markings have been found chalked all over Rome.In 1975, Tic-tac-toe was also used by MIT students\n to demonstrate the computational power of Tinkertoy elements.");
            System.out.println("TERMS:");
            System.out.println("");
            System.out.println("A player can play perfect Tic-tac-toe (win or draw) given they choose the first possible move from the following list.\nWin: If the player has two in a row, they can place a third to get three in a row.\nBlock: If the opponent has two in a row, the player must play the third themself to block the opponent.\nFork: Create an opportunity where the player has two threats to win (two non-blocked lines of 2).Blocking an opponent's fork:\nOption 1: The player should create two in a row to force the opponent into defending,\n as long as it doesn't result in them creating a fork. For example, if 'X' has a corner, 'O' has the center,\n and 'X' has the opposite corner as well, 'O' must not play a corner in order to win. (Playing a corner in this scenario creates a fork for 'X' to win.)\n Option 2: If there is a configuration where the opponent can fork, the player should block that fork.Center: A player marks the center.\n (If it is the first move of the game, playing on a corner gives 'O' more opportunities to make a mistake and \n may therefore be the better choice; however, it makes no difference between perfect players.)\nOpposite corner: If the opponent is in the corner, the player plays the opposite corner.\nEmpty corner: The player plays in a corner square.\nEmpty side: The player plays in a middle square on any of the 4 sides.");
            break;
            case 4:
            flag2=1;
            break;
        }}while(flag2!=1);}}
                
