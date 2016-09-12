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
			System.out.println("How was your day?");
			String input = inputReader.nextLine();
			System.out.println("Oh, you said: " + input + " about your day");
		
		
			System.out.println("My next question is this: What is the best type of food?");
			String foodInput = inputReader.nextLine();
			System.out.println("Ok,you typed this: " + foodInput);
			
			System.out.println("Ok lets continue, How many dogs do you have?");
			int dogInput = inputReader.nextInt();
			System.out.println("Well thats depressing, you said you had: " + dogInput);
			
		}
}

