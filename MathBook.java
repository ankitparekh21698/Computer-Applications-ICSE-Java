
import java.util.*;
import java.io.*;
class MathBook
{
 public static void main()throws IOException
 {
     InputStreamReader isr =new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     Scanner ob=new Scanner(System.in);
     logo ab=new logo();
     MathTricks ab6=new MathTricks();
     AreaCalculator ab2=new AreaCalculator();
     NumberOperations ab5=new NumberOperations();
     VolumeCalculator ab3=new VolumeCalculator(); 
     SurfaceAreaCalculator ab4=new SurfaceAreaCalculator();
     ScientificCalculator ab1=new ScientificCalculator();
     ConversionTable ab7=new ConversionTable();
     int flag=0,ch;
     do{
     do{
         flag=0;
         ab.main();
         System.out.println("1.Scientific Calculator\n2.Area Calculator\n3.Volume Calculator\n4.Surface Area Calculator\n5.Math-Number Operations\n6.Math-Tricks\n7.Math-Conversion Table\n8.Back to iBook menu");
         System.out.println("Enter your choice:");
         ch=ob.nextInt();
         if(ch>=1 && ch<=8)
         {
           flag=1;
           System.out.print("\f");
            }
         else
         {
             System.out.print("\f");
             System.out.println(" Wrong choice...please retry ");
            }
         }while(flag!=1);
         switch(ch)
        {
            case 1:
            ab1.main();
            break;
            case 2:
            ab2.main();
            break;
            case 3:
            ab3.main();
            break;
            case 4:
            ab4.main();
            break;
            case 5:
            ab5.main();
            break;
            case 6:
            ab6.main();
            break;
            case 7:
            ab7.main();
            break;
        }}while(ch!=8);}}