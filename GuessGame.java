import java.util.*;

public class GuessGame {
	public static void main(String[] args) {

		String extra;
		int tries=0;

		// read input data from console
		Scanner input = new Scanner(System.in);

		// generate a random number between 0 and 100;
		int secret_number = (int)(Math.random() * (100-0+1)); //max-min+1
		    secret_number = secret_number + 0; //plus min

		int guess = -1;


		while (secret_number != guess) {
			do {
				// getting input from player and making turning it into an int 
				System.out.println("Enter a number: ");
				while (!input.hasNextInt()) {  //next token is valid integer?
	            
	                System.out.print("Invalid integer, re-enter: ");
	                extra = input.nextLine();  //if more than one num or not a num get == error        
	            }
	            int integer = input.nextInt();  //read next integer
	            extra = input.nextLine(); //get rid of extra on the line
				guess = integer; // guess = get a guess input from player


				if (guess < secret_number) {
					System.out.println("your guess is low");
				}
				else if (guess > secret_number) {
					System.out.println("your guess is high");
				}
				// else
				// 	System.out.println("you guessed right!");
				
				tries++;
			} while (guess != secret_number && tries < 10);

		        if(guess == secret_number){
		            System.out.println("That's right!"); 
		        }else{
		            System.out.println("Incorrect. 10 attempts"); 
		            break;
		        }
		}

	}
}		