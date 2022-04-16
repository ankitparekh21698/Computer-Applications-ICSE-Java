import java.util.*;
class Complex
{
    static double a1,a2,b1,b2;
    Complex(double A1,double B1,double A2,double B2)
    {
        a1=A1;
        b1=B1;
        a2=A2;
        b2=B2;
    }
    Complex()
    {
        System.out.println("Default constructor");
    }
    double add_real(double A1,double A2)
    {
        return a1+a2;
    }
    double add_imag(double B1,double B2)
    {
        return b1+b2;
    }
    double sub_real(double A1,double A2)
    {
        return a1-a2;
    }
    double sub_imag(double B1,double B2)
    {
        return b1-b2;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part of C1:");
        a1=sc.nextDouble();
        System.out.println("Enter the imaginary part of C1:");
        b1=sc.nextDouble();
        System.out.println("Enter the real part of C2:");
        a2=sc.nextDouble();
        System.out.println("Enter the imaginary part of C2:");
        b2=sc.nextDouble();
        Complex ob=new Complex(a1,b1,a2,b2);
        System.out.println("C1+C2 ="+(ob.add_real(a1,a2))+"+j"+(ob.add_imag(b1,b2)));
        System.out.println("C1-C2 ="+(ob.sub_real(a1,a2))+"+j"+(ob.sub_imag(b1,b2)));
    }
}
        