import java.util.*;
public class Calculator
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        int ch;
        do{
        System.out.println("**********CALCULATOR*********");
        System.out.println("1.ADDITION");
        System.out.println("2.SUBTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4.DIVISION");
        System.out.println("5.Exit.");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        if(ch==1 || ch==2 || ch==3 || ch==4)
        {
            System.out.println("Enter the first number:");
            a=sc.nextInt();
            System.out.println("Enter the second number:");
            b=sc.nextInt();
            }
        calculation c1=new calculation(a,b);    
        switch(ch)
        {
            case 1:
            c1.add();
            break;
            case 2:
            c1.sub();
            break;
            case 3:
            c1.mult();
            break;
            case 4:
            c1.div();
            break;
            case 5:
            System.out.println("Thank You for using our services :)");
            break;
            default :
            System.out.println("Wrong choice TRY AGAIN");
        }
    }while(ch!=5);   
}
}
