/**
 * 
 * @author Heidi Hufford and Evan Lim
 *
 */
import java.util.ArrayList;
public class DogOwner extends Person {
	
	//variables
	private String dogOne;
	private String dogTwo;
	private int counter = 0;
	
	
	public DogOwner(String name, String occupation, String dogName1, String dogName2) {
		super(name, occupation);
		// TODO Auto-generated constructor stub
		dogOne = dogName1;
		dogTwo = dogName2;
	}

	/**
	 * Dog owner question method: Goes through each question in the arrayList in order
	 */
	@Override
	void askQuestion() {
		// TODO Auto-generated method stub
		ArrayList<String> aboutDogs = new ArrayList<String>();
		aboutDogs.add("What kind of dog do you have?");
		aboutDogs.add("Whats your favorite dog food?");
		aboutDogs.add("Why don't you like cats?");
		aboutDogs.add("Where do Irish Wolf Hounds come from?");
		aboutDogs.add("How many pets do you have?");
		
		
		System.out.println(aboutDogs.get(this.counter));
		this.counter++;
		
		if(this.counter ==5)
		{
			this.counter = 0;
		}

	}

	@Override
	void answerQuestion() {
		// TODO Auto-generated method stub
		ArrayList<String> answerStuff = new ArrayList<String>();
		answerStuff.add("I have two dogs, " + dogOne + " and " + dogTwo);
		answerStuff.add("Bow Wow Chow");
		answerStuff.add("I like chasing cats");
		answerStuff.add("Scotland- ha Ireland");
		answerStuff.add("10000000000000000000000000000000000000.");
		
		
		System.out.println(answerStuff.get(this.counter));


	}

}
