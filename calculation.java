import java.util.Scanner;
class calculation
{
    int a,b,c,d,e;
    double f;

    calculation(int a, int b)
    {
     this.a=a;
     this.b=b;
    }
    
    void add()
    {
        c=a+b;
        System.out.println("addition is: "+c);
    }
    
    void sub()
    {
        d=a-b;
        System.out.println("subtraction is: "+d);
    }
    
    void mult()
    {
        e=a*b;
        System.out.println("multiplication is: "+e);
    }

    void div()
    {
        f=(double)a/b;
        System.out.println("division is: "+f);
    }

}

