
import java.util.*;
class AreaCalculator
{
 double area,s,l,b,h,s1,s2,s3,sp,r,n,d1,d2,dis;

 void square()
 {
     Scanner ob1=new Scanner(System.in);
     System.out.println("Enter the length of the side of the square:");
     s=ob1.nextDouble();
     area=s*s;
     System.out.println("The area of the square is :"+area);
    }
 void rectangle()
 {
    Scanner ob2=new Scanner(System.in);
    System.out.println("Enter the length of the rectangle:");
    l=ob2.nextDouble();
    System.out.println("Enter the breadth of the rectangle:");
    b=ob2.nextDouble();
    area=l*b;
    System.out.println("The area of the rectangle is :"+area);
    }
 void triangle()
 {
 Scanner ob3=new Scanner(System.in);
 int ch,flag=0;
 do{
 System.out.print("\f");
 System.out.println("********TRIANGLE AREA CALCULATOR********\n1.Using base-height formula\n2.Using Hero's formula\n3.Equilateral Triangle\n4.Isoceles Triangle");
 System.out.println("Enter your choice:");
 ch=ob3.nextInt();
 if(ch>=1 && ch<=4)
 flag=1;
 else
 System.out.println("Wrong choice... retry...");
 }while(flag!=1);
 switch(ch)
 {
     case 1:
     System.out.println("Enter the base of the triangle:");
     b=ob3.nextDouble();
     System.out.println("Enter the height of the triangle:");
     h=ob3.nextDouble();
     area=0.5*b*h;
     System.out.println("The area of the triangle is :"+area);
     break;
     case 2:
     System.out.println("Enter the 1 side  of the triangle:");
     s1=ob3.nextDouble();
     System.out.println("Enter the 2 side  of the triangle:");
     s2=ob3.nextDouble();
     System.out.println("Enter the 3 side  of the triangle:");
     s3=ob3.nextDouble();
     sp=(s1+s2+s3)/2;
     area=Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
     System.out.println("The area of the triangle is :"+area);
     break;
     case 3:
     System.out.println("Enter the side of the equilateral triangle:");
     s=ob3.nextDouble();
     area=1.73205*s*s/4;
     System.out.println("The area of the triangle is :"+area);
     break;
     case 4:
     System.out.println("Enter the one of the equal side of the isoceles triangle:");
     s=ob3.nextDouble();
     System.out.println("Enter the base of the isoceles triangle:");
     b=ob3.nextDouble();
     area=b*Math.sqrt(4*s*s+b*b)/4;
     System.out.println("The area of the triangle is :"+area);
     break;
    }}
 void circle()
 {
     Scanner ob4=new Scanner(System.in);
     System.out.println("Enter the radius of the circle:");
     r=ob4.nextDouble();
     area=3.1415926535*r*r;
     System.out.println("The area of the circle is :"+area);
     
    }
 void polygon()
 {
    Scanner ob5=new Scanner(System.in);
    System.out.println("Enter the no. of sides of the regular polygon:");
    n=ob5.nextDouble();
    System.out.println("Enter the length of the side of the regular polygon:");
    s=ob5.nextDouble();
    dis=180/n;
    area=s*s*n/(4*Math.tan(dis));
    System.out.println("The area of the regular polygon is :"+area);
    
  }
 void parallelogram()
 {
     Scanner ob6=new Scanner(System.in);
     System.out.println("Enter the base of the parallelogram:");
     b=ob6.nextDouble();
     System.out.println("Enter the height of the parallelogram:");
     h=ob6.nextDouble();
     area=b*h;
     System.out.println("The area of the parallelogram is:"+area);
    }
 void rhombus()
 {
     Scanner ob7=new Scanner(System.in);
     System.out.println("Enter the lenght of 1 diagonal of the rhombus:");
     d1=ob7.nextDouble();
     System.out.println("Enter the lenght of 2 diagonal of the rhombus:");
     d2=ob7.nextDouble();
     area=0.5*d1*d2;
     System.out.println("The area of the rhombus is:"+area);
    }
 void trapezium()
 {
     Scanner ob8=new Scanner(System.in);
     System.out.println("Enter the lenght of the 1 parallel side of the trapezium:");
     d1=ob8.nextDouble();
     System.out.println("Enter the lenght of 2 parallel side of the trapezium:");
     d2=ob8.nextDouble();
     System.out.println("Enter the distance between the parallel sides:");
     h=ob8.nextDouble();
     area=0.5*(d1+d2)*h;
     System.out.println("The area of the trapezium is:"+area);
    }
 public static void main()
 {
     Scanner ob9=new Scanner(System.in);
     AreaCalculator ob=new AreaCalculator();
     int ch1,flag1=0;
     do{
     do{flag1=0;
     System.out.println("****************AREA CALCULATOR OPTIONS***********************************************");
     System.out.println("1.Square\n2.Rectangle\n3.Triangle\n4.Circle\n5.Regular Polygon\n6.Parallelogram\n7.Rhombus\n8.Trapezium\n9.Back to MathBook menu");
     System.out.println("Enter your choice:");
     ch1=ob9.nextInt();
     if(ch1>=1 && ch1<=9)
     {
     flag1=1;
     System.out.println("\f");
     }
     else
     System.out.println("Wrong choice...retry...");
    }while(flag1!=1);
    switch(ch1)
    {
        case 1:
        ob.square();
        break;
        case 2:
        ob.rectangle();
        break;
        case 3:
        ob.triangle();
        break;
        case 4:
        ob.circle();
        break;
        case 5:
        ob.polygon();
        break;
        case 6:
        ob.parallelogram();
        break;
        case 7:
        ob.rhombus();
        break;
        case 8:
        ob.trapezium();
        break;
        case 9:
        break;
    }
    }while(ch1!=9);
}}