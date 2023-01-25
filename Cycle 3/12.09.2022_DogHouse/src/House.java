import java.util.Scanner;

public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set up user input and get name of the dog
		Scanner input = new Scanner(System.in); 
		System.out.print("What is the name of your dog? ");
		String name = input.next();
		
		// create Dog object
		Dog myDog = new Dog(name);
		 
		String command;
		String result;
		boolean keepGoing = true;
		 
		// process commands until the user enters "quit"
		do {
		// get next command
			System.out.print("Command: ");
			command = input.next();
			
			// process command
			if (command.equalsIgnoreCase("quit")) {
				keepGoing = false; // we're going to quit
			}
			else if (command.equalsIgnoreCase("feed")) {
				result = myDog.feed();
				System.out.println(" " + result);
			}
			else {// anything else is a sound the dog hears
				result = myDog.hear(command);
				System.out.println(" " + result);
			}
		}
		while (keepGoing); // keep going until quit received
 
		input.close(); // close out user input 
		// display the number of times fed
		int numFed = myDog.getNumTimesFed();
		System.out.println(name + " was fed " + numFed + " times");

	}

}
