
import java.util.*;
public class MathTricks
{
 public static void main()
 {
     Scanner c=new Scanner(System.in);
     int ch,flag=0;
     
     do{
      do{ flag=0;
          System.out.println("***************MATHEMATICAL TRICKS*********************");
          System.out.println("1.How to calculate the day of the week of any date?");
          System.out.println("2.Magic in squares of numbers!!!");
          System.out.println("3.Math Trick 1");
          System.out.println("4.Math Trick 2");
          System.out.println("5.Math Trick 3");
          System.out.println("6.Math Trick 4");
          System.out.println("7.Math Trick 5");
          System.out.println("8.Back to MathBook menu");
          System.out.println("Enter which trick you want to see:");
          ch=c.nextInt();
          if(ch>=1 && ch<=8)
          {
              flag=1;
              System.out.print("\f");
            }
          else
          System.out.println("Wrong choice ...please retry....");
        }while(flag!=1);
      switch(ch)
      {
          case 1:
          System.out.println("***********DAY OF THE WEEK*************");
          System.out.println("January has 31 days. It means that every date in February will be 3 days later than the same date in January(28 is 4 weeks exactly).\nThe below table is calculated in such a way.Remember this table which will help you to calculate."); 
          System.out.println("January   0");
          System.out.println("February  3");
          System.out.println("March     3");
          System.out.println("April     6");
          System.out.println("May       1");
          System.out.println("June      4");
          System.out.println("July      6");
          System.out.println("August    2");
          System.out.println("September 5");
          System.out.println("October   0");
          System.out.println("November  3");
          System.out.println("December  5");
          System.out.println("Step1: Ask for the Date. Ex: 23rd June 1986");
          System.out.println("Step2: Number of the month on the list, June is 4.");
          System.out.println("Step3: Take the date of the month, that is 23");
          System.out.println("Step4: Take the last 2 digits of the year, that is 86.");
          System.out.println("Step5: Find out the number of leap years. Divide the last 2 digits of the year by 4, 86 divide by 4 is 21.");
          System.out.println("Step6: Now add all the 4 numbers: 4 + 23 + 86 + 21 = 134");
          System.out.println("Step7: Divide 134 by 7 = 19 remainder 1.");
          System.out.println("The reminder tells you the day.");
          System.out.println("Sunday    0");
          System.out.println("Monday    1");
          System.out.println("Tuesday   2");
          System.out.println("Wednesdy  3");
          System.out.println("Thursday  4");
          System.out.println("Friday    5");
          System.out.println("Saturday  6");
          System.out.println("ANSWER:Monday");
          break;
          case 2:
          System.out.println("****************MAGIC SQUARES******************************");
          System.out.println("The result of squaring a number can also be arrived at by\n progressively adding consecutive odd numbers as shown below.");
          System.out.println("1x1    = 1     = 1");
          System.out.println("2x2    = 4     = 1+3");
          System.out.println("3x3    = 9     = 1+3+5");
          System.out.println("4x4    = 16    = 1+3+5+7");
          System.out.println("5x5    = 25    = 1+3+5+7+9");
          System.out.println("6x6    = 36    = 1+3+5+7+9+11");
          System.out.println("7x7    = 49    = 1+3+5+7+9+11+13");
          System.out.println("8x8    = 64    = 1+3+5+7+9+11+13+15");
          System.out.println("9x9    = 81    = 1+3+5+7+9+11+13+15+17");
          System.out.println("10x10  = 100   = 1+3+5+7+9+11+13+15+17+19");
          System.out.println("AMAZING!!!");
          break;
          case 3:
          System.out.println("****************MATH TRICK 1******************************");
          System.out.println("Step1: Think of a number .");
          System.out.println("Step2: Multiply it by 3.");
          System.out.println("Step3: Add 6 with the getting result.");
          System.out.println("Step4: divide it by 3.");
          System.out.println("Step5: Subtract it from the first number used");
          System.out.println("ANSWER:2");
          break;
          case 4:
          System.out.println("****************MATH TRICK 2******************************");
          System.out.println("Step1: Think of any number.");
          System.out.println("Step2: Double the number.");
          System.out.println("Step3: Add 9 with result.");
          System.out.println("Step4: sub 3 with the result.");
          System.out.println("Step5: Divide the result by 2.");
          System.out.println("Step6: Subtract the number with the number with first number started with.");
          System.out.println("ANSWER:3");
          break;
          case 5:
          System.out.println("****************MATH TRICK 3******************************");
          System.out.println("Step1:Think of any three digited number.");
          System.out.println("Step2:Add 7 to it.");
          System.out.println("Step3:Multiply the number with 2.");
          System.out.println("Step4:subtract 4 with the result.");
          System.out.println("Step5:Divide the result by 2.");
          System.out.println("Step6:Subtract it from the number started with.");
          System.out.println("ANSWER:5");
          break;
          case 6:
          System.out.println("****************MATH TRICK 4******************************");
          System.out.println("STEP 1:Ask a friend to write down a number (any number with more than 3 digits will do,\n but to save time and effort you might suggest a maximum of 8 digits).Example: 83 972 105");
          System.out.println(" ");
          System.out.println("STEP 2:Ask them to add the digits.Example: 8+3+9+7+2+1+0+5 = 35");
          System.out.println(" ");
          System.out.println("STEP 3:Ask them to subtract this number from the original one.\n Example: 83 972 105 Ð 35 = 83 972 070");
          System.out.println(" ");
          System.out.println("STEP 4:Ask them to select any digit from this new number and strike it out,\n without showing you.Example: 83 972 070...He/she strikes digit 2");
          System.out.println(" ");
          System.out.println("STEP 5:Ask them to add the remaining digits and write down the answer they get.\n Example: 8+3+9+7+0+7+0 = 34");
          System.out.println(" ");
          System.out.println("STEP 6:Ask them to tell you the number they get (34) and you will tell them\n which number they struck out.");
          System.out.println(" ");
          System.out.println("SOLUTION:The way you do this is to subtract the number they give you from the next multiple of 9.\n The answer you get is the number they struck out.Example: The next multiple of 9 here is 36 (9 x 4 =36)?36 Ð 34 = 2\nand there you have your answer, easy isnÕt it!");
          System.out.println(" ");
          System.out.println("Note: If the number they give you after step 5 is a  multiple of 9, there are two possible answers\n then you simply tell them that this time they crossed out either a 9 or a zero.");
          break;
          case 7:
          System.out.println("****************MATH TRICK 5******************************");
          System.out.println("Amazing 1089...");
          System.out.println("Step1:Take two pieces of paper and hand one to a friend.On yours, without letting them see,\n write the number 1089, then fold the paper to keep it hidden.");
          System.out.println(" ");
          System.out.println("Step2:Ask them to think of a 3-digit number but, before they write it down, ask them to put\n the numbers in order from greatest to smallest. Don't let them show what they've written.Example: 543");
          System.out.println(" ");
          System.out.println("Step3:Below their number, ask them to write the same digits, but in reverse order,\n from smallest to greatest.Example: 345");
          System.out.println(" ");
          System.out.println("Step4:Now, ask them to subtract the new lower number from the original one they wrote.Example: 198");
          System.out.println(" ");
          System.out.println("Step5:Next, ask them to reverse the order of that number.Example: 891");
          System.out.println(" ");
          System.out.println("Step6:Then, get them to add this latest number and the previous number together and\n show you the result.Example: 891 + 198 = 1089");
          System.out.println(" ");
          System.out.println("Step7:Finally, you can reveal your own number, which (if they have calculated correctly)\n will be exactly what they have written...1089");
          System.out.println(" ");
          System.out.println("AMAZING!!!");
          break;
          case 8:
          break;
        }
    }while(ch!=8);
}
}