import java.util.Random;
import java.util.Scanner;


public class ThreeCardMonte {

	public static void main(String[] args) 
	{
		GuessPrinter print = new GuessPrinter();
		Scanner scan = new Scanner(System.in);
		String answer = "y";
		int guess;
		double bet = 0;
		double sum = 0;
		double start = 100;
		while(answer.equalsIgnoreCase("y"))
		{
			System.out.println("What is your bet? (min$5)");
			bet = scan.nextDouble();
			
			Random r = new Random();
			int ball = 1 + r.nextInt(3);
			
			System.out.println("Which card is the Ace?\n");
			System.out.println("##\t##\t## \n1\t2\t3");
			guess = scan.nextInt();
			
			if (guess == ball)
			{
				System.out.println("YES! You win!!\n");
				sum = start+bet;
				start = sum;

			}
			else
			{
				sum = start-bet;
				start = sum;
				System.out.println("Sorry, hand over your money!");
					
			}
			if (ball == 1)
				print.guess1();
			else if (ball == 2)
				print.guess2();
			else
				print.guess3();
		
			System.out.println("Balance: " +sum);
			
			if(sum>500)
			{
				System.out.println("YOU WON THE GAME!");
				answer = "n";
			}
			else if (sum<5)
			{
				System.out.println("YOU LOST THE GAME!");
				answer = "n";
			}
			else
			{
			System.out.println("Want to play again? (y/n)\n");
			answer = scan.next();
			}
			
		
		}
		
	}
}


//the class guessprinter
public class GuessPrinter 
{
	
	
	public void guess1()
	{
		System.out.println("AA\t##\t## \n1\t2\t3\n");
	}

	public void guess2()
	{
		System.out.println("##\tAA\t## \n1\t2\t3\n");
	}

	public void guess3()
	{
		System.out.println("##\t##\tAA \n1\t2\t3\n");
	}
	
}
