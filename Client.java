import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                VotingApplication voteAge=new VotingApplication();
		int a=sc.nextInt();
		
		int result=0;
		
		result=voteAge.vote(a);
		
		if(result<18) {
			try {
			throw new InvalidException("You Connot Vote");
			}catch(InvalidException e) {
				
			}
		}
		else {
			System.out.println("You Are Valid To Vote");
		}
		
	}

}