/**Purpose: Data related to station including name and list of detectives
 * @author - Heidi Hufford and Evan Lim
 */

import java.util.Scanner;

public class Station {
	public final int MAX_DETECTIVES = 5;
	static int lastBadgeNumber=1;
	Detective[] detectiveList = new Detective[MAX_DETECTIVES];
	private String stationName;
	private int currentDetectives = 0;
	
	/**
	 * Constructor
	 */	
	public Station(String stationName) {
		super();
		this.stationName = stationName;
	}

	/**
	 * Checks if number of detectives is already at the limit
	 * Prompts user for the name
	 * Generates badge number
	 * Creates Detective
	 * Adds to array of detectives
	 */	
	public void hire() {
		//check if the number of detectives is already 5
		//if yes, print error message
		if (currentDetectives == MAX_DETECTIVES)
		{
			System.out.println("This station already has the maximum number of detectives.");
		}
		else {
			//prompt user for name
			
			Scanner userInput = new Scanner(System.in);
			System.out.print("New hire for " + this.stationName + "...Enter detective's name:");
			String detectiveName ="";
			//if (userInput.hasNextLine()) {
			detectiveName = userInput.nextLine();
			//userInput.close();
				
			//}
			
			//make detective
			Detective detective = new Detective(detectiveName, lastBadgeNumber);
			lastBadgeNumber++;
			currentDetectives++;
			
			//place new detective in array
			detectiveList[currentDetectives-1] = detective;
				
		}
		
	
	}
	
	/**
	 * Prints all detectives in the array
	 */	
	
	public void printDetectives()
	{
		System.out.println("List of detectives for " + (this.stationName));
		for (Detective d: detectiveList)
		{
			if (d != null) {
				System.out.println(d);
			}
		}
	}
	
		
	
}