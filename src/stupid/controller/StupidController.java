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
			
			System.out.println("Ok lets continue, How many dogs do you have?");
			int dogInput = inputReader.nextInt();
			System.out.println("Well thats depressing, you said you had: " + dogInput + ". Real men have at least 300 kek");
			
			System.out.println("While we're doing numbers, what is your favorite decimal? It can as long as you want bby!");
			Double favNumbInput = inputReader.nextDouble();
			System.out.println("Hey fam, " + favNumbInput + " Is a crap number. Pick a better one next time.");
			
			System.out.println("Now to the REAL questions. Those last ones were just a prank. Do you play Grepolis???");
			String grepInput = inputReader.next();
			System.out.println("You said " + grepInput + ". Dont be quirky, of course you dont play this crap. No one does ;(");
			
			System.out.println("Lets keep going with amazing questions. How many houses do you own?");
			float houseInput = inputReader.nextFloat();
			System.out.println("Thats cool. Do you really have " + houseInput + "? I only have 1. Quite unfortunate.");
			
			
		}
}

