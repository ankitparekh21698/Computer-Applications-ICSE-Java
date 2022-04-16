import java.util.*;
public class VJTIexperiment
{
public static void main()
{
     Scanner sc=new Scanner(System.in);
     System.out.println("\f");
     System.out.println("Please Enter Your Vote:");
     System.out.println("1)Candidate 1");
     System.out.println("2)Candidate 2");
     System.out.println("3)Candidate 3");
     System.out.println("4)Candidate 4");
     System.out.println("5)Candidate 5");
     int count[]=new int[5];
     int countspoilt=0;
     int votearray[]=new int[10];
     VotingBallot a=new VotingBallot();
     votearray=a.votingSystem();
     a.displayVoting(votearray);
     for(int i=0;i<votearray.length;i++)
     {
     switch(votearray[i])
     {
     case 1:
     count[0]++;
     break;
     case 2:
     count[1]++;
     break;
     case 3:
     count[2]++;
     break;
     case 4:
     count[3]++;
     break;
     case 5:
     count[4]++;
     break;
     default:
     countspoilt++;
     }
     }
     a.displayNoOfVotes(count);
     

}

}
