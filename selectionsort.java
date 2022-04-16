import java.util.*;
class selectionsort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        int n,temp;
        System.out.println("Enter the length of the array to be sorted:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+(i+1)+" element:");
            a[i]=sc.nextInt();
        }
         for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        }  
        System.out.println(); 
        System.out.print("The sorted array is:");
         for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ,  ");
        } 
        System.out.println();
    }
}