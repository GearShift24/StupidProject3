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
			System.out.println("Wow, you like: " + foodInput + "I HATE that flavor zzz");
			
			System.out.println("Ok lets continue, How many dogs do you have?");
			int dogInput = inputReader.nextInt();
			System.out.println("Well thats depressing, you said you had: " + dogInput);
			
			System.out.println("While we're doing numbers, what is your favorite decimal? It can as long as you want bby!");
			Double favNumbInput = inputReader.nextDouble();
			System.out.println("Hey fam, " + favNumbInput + " Is a crap number. Pick a better one next time.");
			
			
			
		}
}

