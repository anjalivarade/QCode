import java.util.*;
public class NumberGuessingGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low=1,high=100;
		Random rnumber =new Random();
		Scanner sc=new Scanner(System.in);
		
		int randomNumber= rnumber.nextInt(100);
		int count=0;
		System.out.println("Random Number : "+randomNumber);
		while(true) {
			System.out.println("Enter your Guess("+low+"-"+high+") : ");
			int UserGuess=sc.nextInt();
			if(UserGuess>randomNumber) {
					high=UserGuess;
			}
			else {
				low=UserGuess;
			}
			count++;
			if(count>5) {
				System.out.println("You Reached Guessing Limit.");
				System.out.println("The Correct Number is : "+randomNumber);
				break;
			}
			if(UserGuess==randomNumber) {
				if(count==1) {
					System.out.println("You Win!!");
					System.out.println("Yeah! You guessed Correct Number in your 1st try.");
					//System.out.println("Your Score is:"+score);
					break;
				}
				System.out.println("Correct Guess! \nYou Win!!");
				System.out.println("It took "+count+" tries to guess the Correct Number.");
				break;
			}
			else if(randomNumber>UserGuess) {
				System.out.println("The Number is Higher. \nGuess Again!!\n");
			}
			else {
				System.out.println("The Number is Lower. \nGuess Again!!\n");
			}
		}

	}

}
