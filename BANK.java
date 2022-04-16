import java.util.*;
class BANK
{
    static Scanner sc=new Scanner(System.in);
    static double bal,dep,wit;
    static String s;
    static long acc_no;
    
    void input()
    {
        System.out.print("Enter your name:");
        s=sc.next();
        System.out.println("Enter your account number:");
        acc_no=sc.nextLong();
    }
    void initial_bal()
    {
        System.out.println("Enter the initial balance:");
        bal=sc.nextDouble();
        
    }
    void deposit()
    {
        System.out.println("Enter the amount to be deposited:");
        dep=sc.nextDouble();
        bal+=dep;
        System.out.println("Transcation successful.");
    }
    void withdrawal()
    {
        System.out.println("Enter the amount to be withdrawn:");
        wit=sc.nextDouble();
        bal-=wit;
        System.out.println("Transcation successful.");
    }
    void display()
    {
        System.out.println("********ABC BANK**************");
        System.out.println("Name:"+s);
        System.out.println("Account NO.:"+acc_no);
        System.out.println("Balance is Rs."+bal);
    }
    public static void main()
    {
        int ch;
        BANK ob=new BANK();
        do{
        System.out.println("********ABC BANK PORTAL*********");
        System.out.println("1.To enter initial balance.");
        System.out.println("2.To Deposit.");
        System.out.println("3.To Withdraw.");
        System.out.println("4.To generate Balance Receipt.");
        System.out.println("5.Exit.");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        ob.input();
        switch(ch)
        {
            case 1:
            ob.initial_bal();
            break;
            case 2:
            ob.deposit();
            break;
            case 3:
            ob.withdrawal();
            break;
            case 4:
            ob.display();
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
        
    