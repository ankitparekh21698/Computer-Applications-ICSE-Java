import java.util.*;
class bubblesort
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
        for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                 //swap elements  
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         }  
                          
                 }  
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