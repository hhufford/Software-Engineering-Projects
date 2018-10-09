
/**
 * 
 * @author Heidi Hufford and Evan Lim
 *
 */
public class Hobo extends Person {

	public Hobo(String name, String occupation) {
		super(name,occupation);
		// TODO Auto-generated constructor stub
	
	}
	
	
	
	/**
	 * Asks and answers question
	 * Hobo method: He always prints out the same question and answer
	 */
	@Override
	void askQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Do you like to eat pizza?");

	}

	@Override
	void answerQuestion() {
		// TODO Auto-generated method stub
		System.out.println("No I'm allegic...");

	}

}
