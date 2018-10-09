/**
 * 
 * @author Heidi Hufford and Evan Lim
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class Cowboy extends Person {
	
	public Cowboy(String name, String occupation) {
		super(name, occupation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Cowboy method: randomly picks question/answer from ArrayList
	 */
	@Override
	void askQuestion() {
		// TODO Auto-generated method stub
		ArrayList<String> cowQ = new ArrayList<String>();
		cowQ.add("Whats your horses name?");
		cowQ.add("Why is a Quarter Horse called Quater?");
		cowQ.add("Where is a honda on a rope?");
		cowQ.add("How do you tell a buckskin from a palimino?");
		cowQ.add("How many steers are born in a year?");
		
		Random rand = new Random();
		
		int randomVar = rand.nextInt(4)+1;
		
		System.out.println(cowQ.get(randomVar));
	}

	@Override
	void answerQuestion() {
		// TODO Auto-generated method stub
		ArrayList<String> cowA = new ArrayList<String>();
		cowA.add("Bullwinkle, and Arrow, and Rocky");
		cowA.add("Because they always pay in quarters.");
		cowA.add("That must be a really big rope to fit a car on it.");
		cowA.add("Buckskins wear deer.");
		cowA.add("None, guy cows are born as Bulls");
		cowA.add("Because they are the fastest horse at a quarter mile");
		cowA.add("its the loop that the end of the rope passes through");
		cowA.add("Buckskins have dark socks, and a dorsil stripe.");
		
		Random rand = new Random();
		
		int randomVar = rand.nextInt(4)+1;
		
		System.out.println(cowA.get(randomVar));
	}
}


