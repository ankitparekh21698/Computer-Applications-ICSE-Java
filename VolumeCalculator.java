
import java.util.*;
public class VolumeCalculator
{
 public static void main()
 {
     Scanner sc=new Scanner(System.in);
     final double p=3.14159265358979;int flag=0,ch;
     double s,v,l,b,h,r,R;
     do{
      do{flag=0;   
      System.out.println("**********VOLUME CALCULATOR**********");
      System.out.println("1.Cube\n2.Cuboid\n3.Cylinder\n4.Cone\n5.Sphere\n6.Frustum\n7.Square-based Pyramid\n8.Back to MathBook menu");
      System.out.println("Enter your choice:");
      ch=sc.nextInt();
      if(ch>=1 && ch<=9)
      {
      flag=1;
      System.out.print("\f");
       }
      else
      System.out.println("Wrong Choice....please retry....");
    }while(flag!=1);
    switch(ch)
    {
       case 1:
       System.out.println("Enter the lenght of the side of the cube:");
       s=sc.nextDouble();
       v=s*s*s;
       System.out.println("The volume of the cube is :"+v);
       break;
       case 2:
       System.out.println("Enter the length of the cuboid:");
       l=sc.nextDouble();
       System.out.println("Enter the breadth of the cuboid:");
       b=sc.nextDouble();
       System.out.println("Enter the height of the cuboid:");
       h=sc.nextDouble();
       v=l*b*h;
       System.out.println("The volume of the cuboid is :"+v);
       break;
       case 3:
       System.out.println("Enter the radius of the cylinder:");
       r=sc.nextDouble();
       System.out.println("Enter the height of the cylinder:");
       h=sc.nextDouble();
       v=3.14159265358979*r*r*h;
       System.out.println("The volume of the cylinder is :"+v);
       break;
       case 4:
       System.out.println("Enter the radius of the cone:");
       r=sc.nextDouble();
       System.out.println("Enter the height of the cone:");
       h=sc.nextDouble();
       v=p*r*r*h/3;
       System.out.println("The volume of the cone is :"+v);
       break;
       case 5:
       System.out.println("Enter the radius of the sphere:");
       r=sc.nextDouble();
       v=4*p*r*r*r/3;
       System.out.println("The volume of the sphere is :"+v);
       break;
       case 6:
       System.out.println("Enter the base radius of the frustum:");
       R=sc.nextDouble();
       System.out.println("Enter the top surface radius of the frustum:");
       r=sc.nextDouble();
       System.out.println("Enter the height of the frustum:");
       h=sc.nextDouble();
       v=p*h*(R*R+R*r+r*r)/3;
       System.out.println("The volume of the frustum is :"+v);
       break;
       case 7:
       System.out.println("Enter the length of the side of the base of the square-based pyramid:");
       b=sc.nextDouble();
       System.out.println("Enter the height of the pyramid:");
       h=sc.nextDouble();
       v=b*b*h/3;
       System.out.println("The volume of the square-based pyramid is :"+v);
       break;
       case 8:
       break;
    }}while(ch!=8);
}
}
