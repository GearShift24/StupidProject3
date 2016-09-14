package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner inputReader;
	
	 public StupidController()
	 {
		 myName = "Joseph Wrigley";
		 inputReader = new Scanner(System.in);
	 }
	 
		public void start()
		{
			System.out.println("Welcome to the questionerre!");
			System.out.println(myName);
			askQuestion();
		}
		
		private void askQuestion()
		{
			System.out.println("Ok, lets start off easy. How was your day?");
			String input = inputReader.nextLine();
			System.out.println("Nice, your day was " + input + ". Mine is fine, thanks for asking :|");
		
			System.out.println("Here goes the next question: What type of pizza is your favorite?");
			String foodInput = inputReader.next();
			System.out.println("Wow, you like: " + foodInput + ". I HATE that flavor zzz. Pata mazolli is much better!");
			inputReader.nextLine(); //Used to consume unneeded potential inputs//
			
			System.out.println("Ok lets continue, How many dogs do you have?");
			int dogInput = inputReader.nextInt();
			System.out.println("Well thats depressing, you said you had: " + dogInput + ". Real men have at least 300 kek");
			inputReader.nextLine(); //Used to consume unneeded potential inputs//
			
			System.out.println("While we're doing numbers, what is your favorite decimal? It can as long as you want bby!");
			double favNumbInput = inputReader.nextDouble();
			System.out.println("Hey fam, " + favNumbInput + " Is a crap number. Pick a better one next time.");
			inputReader.nextLine(); //Used to consume unneeded potential inputs//
			
			
			
			

			
			
			System.out.println("Now to the REAL questions. Those last ones were just a prank. Do you play Grepolis??? Yes or no?");
			String grepInput = inputReader.nextLine();
			if(grepInput.equals("yes"))
			{
				System.out.println("You said " + grepInput + ". WOW YOU PLAY?? ADD ME @PokeApolo my man!");
				
			}
			
			System.out.println("You said " + grepInput + ". Dont be quirky, of course you dont play this crap. No one does ;(");

			
			
			
			
			
			System.out.println("Lets keep going with amazing questions. How many houses do you own? (You can have half a house if you are cool by the way)");
			float houseInput = inputReader.nextFloat();
			System.out.println("Thats cool. Do you really have " + houseInput + "? I only have 1. Quite unfortunate.");
			inputReader.nextLine(); //Used to consume unneeded potential inputs//
			
			System.out.println("So those questions were cool amirite? Anyways... Lets do a yes or no question. Do you like fossil fuels?");
			String impossibleInput = inputReader.nextLine();
			System.out.println("You said " + impossibleInput + ". Gotcha again. Doesnt matter what you think, either way were gunna burn em and destory the world eyyyyyyyyyyyyyy!");
			
			System.out.println("Great job on the quiz so far. You are amazing 10/10. The final question is what do you rate Rocky Balboa out of 10?");
			double rockyInput = inputReader.nextDouble();
			System.out.println("You really think it is an " + rockyInput + "/10? Thats cool. Anyways thanks for answering my stuff. Have a nice day!");
			inputReader.nextLine(); //Used to consume unneeded potential inputs//
			
			System.out.println("HA I GOT YOU. THERE ARE STILL TWO MORE QUESTIONS HEHEHE. Ok, what is your favorite tv show?");
			String showInput = inputReader.nextLine();
			System.out.println("You like " + showInput + "? Wow me too. What are the chances???");
			
			System.out.println("Ok real last question this time. How much do you like coding? Answer with a single word as that is all that is required.");
			String enjoyInput = inputReader.next();
			System.out.println("You like programming " + enjoyInput + ". Nice! Same bruh! Anyways have a wonderful day!");
			inputReader.nextLine(); //Used to consume unneeded potential inputs//
			
			
		}
}

