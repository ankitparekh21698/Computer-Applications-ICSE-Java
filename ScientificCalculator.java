
import java.io.*;
class ScientificCalculator
{
 public static void main()throws IOException
 {
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     double z,x,y,sum=0,sum1=1;long fac=1;
     int i,limit;
     int ch;
     int flag;
     do{
     do{
     flag=0;    
     System.out.println("**********Scientific Calculator Menu **********\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n6.Power\n7.Squareroot\n8.Square\n9.Cube\n10.Logarithm\n11.sin value\n12.cos value\n13.tan value\n14.cosec value\n15.sec value\n16.cot value\n17.asin value\n18.acos value\n19.atan value\n20.atan2 value\n21.rint(rounded) value\n22.Maximum value\n23.Minimum value");
     System.out.println("24.Factorial\n25.Back to MathBook menu");
     System.out.println("Enter your choice:");
     ch=Integer.parseInt(br.readLine());
     if(ch>=1 && ch<=25)
     {flag=1;
     System.out.print("\f");}
     else 
     System.out.println("WRONG CHOICE...retry...");
     }while(flag!=1);
     switch(ch)
     {
      case 1:
      System.out.println(" Enter the number of values you want to add:");
      limit=Integer.parseInt(br.readLine());
      for(i=1;i<=limit;i++)
      {
      System.out.println("Enter the "+i+" value :");
      x=Double.parseDouble(br.readLine());
      sum=sum+x;
      }
      System.out.println("The sum is : "+sum);
      break;
      case 2:
      System.out.println("Enter the first value :");
      x=Double.parseDouble(br.readLine());
      System.out.println("Enter the second value :");
      y=Double.parseDouble(br.readLine());
      z=x-y;
      System.out.println("The difference is : "+z);
      break;
      case 3:
      System.out.println(" Enter the number of values you want to multiply:");
      limit=Integer.parseInt(br.readLine());
      for(i=1;i<=limit;i++)
      {
      System.out.println("Enter the "+i+" value :");
      x=Double.parseDouble(br.readLine());
      sum1=sum1*x;
      }
      System.out.println("The product is : "+sum1);
      break;
      case 4:
      System.out.println("Enter the dividend value :");
      x=Double.parseDouble(br.readLine());
      System.out.println("Enter the divisor value :");
      y=Double.parseDouble(br.readLine());
      z=x/y;
      System.out.println("The quotient is : "+z);
      break;
      case 5:
      System.out.println("Enter the dividend value :");
      x=Double.parseDouble(br.readLine());
      System.out.println("Enter the divisor value :");
      y=Double.parseDouble(br.readLine());
      z=x%y;
      System.out.println("The remainder is : "+z);
      break;
      case 6:
      System.out.println("Enter the base value :");
      x=Double.parseDouble(br.readLine());
      System.out.println("Enter the power :");
      y=Double.parseDouble(br.readLine());
      z=Math.pow(x,y);
      System.out.println("The answer is : "+z);
      break;
      case 7:
      System.out.println("Enter the value for squareroot :");
      x=Double.parseDouble(br.readLine());
      z=Math.sqrt(x);
      System.out.println("The squareroot of "+x+" is : "+z);
      break;
      case 8:
      System.out.println("Enter the value :");
      x=Double.parseDouble(br.readLine());
      z=x*x;
      System.out.println("The square of "+x+" is : "+z);
      break;
      case 9:
      System.out.println("Enter the value :");
      x=Double.parseDouble(br.readLine());
      z=x*x*x;
      System.out.println("The cube of "+x+" is : "+z);
      break;
      case 10:
      System.out.println("Enter the value:");
      x=Double.parseDouble(br.readLine());
      z=Math.log(x);
      System.out.println("The log value of "+x+" is : "+z);
      break;
      case 11:
      System.out.println("Enter the degree value for sin:");
      x=Double.parseDouble(br.readLine());
      z=Math.sin(x);
      System.out.println("The sin value in radians of "+x+" is : "+z);
      break;
      case 12:
      System.out.println("Enter the degree value for cos:");
      x=Double.parseDouble(br.readLine());
      z=Math.cos(x);
      System.out.println("The cos value in radians of "+x+" is : "+z);
      break;
      case 13:
      System.out.println("Enter the degree value for tan:");
      x=Double.parseDouble(br.readLine());
      z=Math.sin(x);
      System.out.println("The tan value in radians of "+x+" is : "+z);
      break;
      case 14:
      System.out.println(" Enter the degree value for cosec :");
      x=Double.parseDouble(br.readLine());
      z=1/Math.sin(x);
      System.out.println(" The cosec value in radians is :"+z);
      break;
      case 15:
      System.out.println(" Enter the degree value for sec :");
      x=Double.parseDouble(br.readLine());
      z=1/Math.cos(x);
      System.out.println(" The sec value in radians is :"+z);
      break;
      case 16:
      System.out.println(" Enter the degree value for cot :");
      x=Double.parseDouble(br.readLine());
      z=1/Math.tan(x);
      System.out.println(" The cot value in radians is :"+z);
      break;
      case 17:
      System.out.println("Enter the radians value for sin.");
      x=Double.parseDouble(br.readLine());
      z=Math.asin(x);
      System.out.println("The sin value in degrees of "+x+" is : "+z);
      break;
      case 18:
      System.out.println("Enter the radians value for cos.");
      x=Double.parseDouble(br.readLine());
      z=Math.acos(x);
      System.out.println("The cos value in degrees of "+x+" is : "+z);
      break;
      case 19:
      System.out.println("Enter the radians value for tan.");
      x=Double.parseDouble(br.readLine());
      z=Math.asin(x);
      System.out.println("The tan value in degrees of "+x+" is : "+z);
      break;
      case 20:
      System.out.println("Enter the radians value of the numerator for tan.");
      x=Double.parseDouble(br.readLine());
      System.out.println("Enter the radians value of the denominator for tan.");
      y=Double.parseDouble(br.readLine());
      z=Math.atan2(x,y);
      System.out.println("The tan value in degrees is "+z);
      break;
      case 21:
      System.out.println("Enter the decimal value .");
      x=Double.parseDouble(br.readLine());
      z=Math.rint(x);
      System.out.println("The rounded value is "+z);
      break;
      case 22:
      System.out.println("Enter the first value .");
      x=Double.parseDouble(br.readLine());
      System.out.println("Enter the second value .");
      y=Double.parseDouble(br.readLine());
      z=Math.max(x,y);
      System.out.println("The maximum value is "+z);
      break;
      case 23:
      System.out.println("Enter the first value .");
      x=Double.parseDouble(br.readLine());
      System.out.println("Enter the second value .");
      y=Double.parseDouble(br.readLine());
      z=Math.min(x,y);
      System.out.println("The minimum value is "+z);
      break;
      case 24:
      System.out.println("Enter the no. to calculate its factorial:");
      x=Double.parseDouble(br.readLine());
      for(i=1;i<=x;i++)
      {
          fac=fac*i;
        }
      System.out.println("The factorial is :"+fac);
      break;
      case 25:
      break;
      }
}while(ch!=25);
}
}
