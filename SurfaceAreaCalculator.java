
import java.util.*;
public class SurfaceAreaCalculator
{
 public static void main()
 {
     Scanner sc=new Scanner(System.in);
     final double p=3.14159265358979;int flag=0,ch;
     double s,sa,l,b,h,r,R,sl;
     do{
      do{flag=0;   
      System.out.println("*****************SURFACE AREA CALCULATOR***************************************");
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
       System.out.println("Enter the length of the side of the cube:");
       s=sc.nextDouble();
       sa=6*s*s;
       System.out.println("The surface area of the cube is :"+sa);
       break;
       case 2:
       System.out.println("Enter the length of the cuboid:");
       l=sc.nextDouble();
       System.out.println("Enter the breadth of the cuboid:");
       b=sc.nextDouble();
       System.out.println("Enter the height of the cuboid:");
       h=sc.nextDouble();
       sa=2*l*b+2*l*h+2*b*h;
       System.out.println("The surface area of the cuboid is :"+sa);
       break;
       case 3:
       System.out.println("Enter the radius of the cylinder:");
       r=sc.nextDouble();
       System.out.println("Enter the height of the cylinder:");
       h=sc.nextDouble();
       sa=2*p*r*h+2*p*r*r;
       System.out.println("The surface area of the cylinder is :"+sa);
       break;
       case 4:
       System.out.println("Enter the radius of the cone:");
       r=sc.nextDouble();
       System.out.println("Enter the height of the cone:");
       h=sc.nextDouble();
       sl=Math.sqrt(r*r+h*h);
       sa=p*r*sl+p*r*r;
       System.out.println("The surface area of the cone is :"+sa);
       break;
       case 5:
       System.out.println("Enter the radius of the sphere:");
       r=sc.nextDouble();
       sa=4*p*r*r;
       System.out.println("The surface area of the sphere is :"+sa);
       break;
       case 6:
       System.out.println("Enter the base radius of the frustum:");
       R=sc.nextDouble();
       System.out.println("Enter the top surface radius of the frustum:");
       r=sc.nextDouble();
       System.out.println("Enter the height of the frustum:");
       h=sc.nextDouble();
       sl=Math.sqrt(Math.pow(R-r,2)+h*h);
       sa=p*sl*(R+r);
       System.out.println("The surface area of the frustum is :"+sa);
       break;
       case 7:
       System.out.println("Enter the length of the side of the base of the square-based pyramid:");
       b=sc.nextDouble();
       System.out.println("Enter the height of the pyramid:");
       h=sc.nextDouble();
       sl=Math.sqrt(h*h+Math.pow(b/2,2));
       sa=2*b*sl+b*b;
       System.out.println("The surface area of the square-based pyramid is :"+sa);
       break;
       case 8:
       break;
    }}while(ch!=8);
}
}
