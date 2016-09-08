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
			System.out.println("This program is less stupid");
			System.out.println(myName);
			askQuestion();
		}
		
		private void askQuestion()
		{
			System.out.println("How was your day?");
			String input = inputReader.nextLine();
			System.out.println("Oh, you said: " + input + " about your day");
		}
}
