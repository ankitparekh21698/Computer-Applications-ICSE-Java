import java.util.*;
class VotingBallot
{
    Scanner sc=new Scanner(System.in);
int votearray[]=new int[10];
int[] votingSystem()
{
    int flag=0;
     for(int i=1;i<=10;i++)
     {
         flag=0;
         while(flag==0)
      try{
          System.out.println("Vote"+i+":");
          int t=sc.nextInt();
          if(t==1 || t==2 || t==3 || t==4 || t==5 )
          {votearray[i-1]=t;
            flag=1;}
          else throw new InputMismatchException("e");
     }catch( InputMismatchException e)
     {
         System.out.println("Invalid Vote.Enter the correct choice.");
        }
    
    }
    return votearray;
   }
void displayVoting(int[]t)
{
System.out.println("Final Voting Results:");
System.out.println("Vote"+"\t"+"Voting Done by Voters");
int j=1;
for(int i:t)
{
System.out.println(j+"\t"+"Candidate"+i);
j++;
}
}
void displayNoOfVotes(int[]t1)
{
System.out.println("Displaying Final Vote Count:");
System.out.println("Candidate"+"\t"+"Votes Gained");
int j=1;
for(int i:t1)
{
System.out.println(j+"\t"+"\t"+i);
j++;
}
}
}

