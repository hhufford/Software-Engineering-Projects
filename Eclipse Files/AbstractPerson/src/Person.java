
/**
 * 
 * @author Heidi Hufford and Evan Lim
 *
 */
abstract public class Person {
	private String myName;
	private String occupation;
	
	/**
	 * 
	 * @param name hold the persons name
	 * @param occupation holds the person's occupation
	 */
	public Person(String name, String occupation) {
		super();
		// TODO Auto-generated constructor stub
		this.myName = name;
		this.occupation = occupation;
	}


	

	/**
	 * Asks for their name
	 */
	void askName() {
		System.out.println("What is your name?");
	}
	
	/**
	 * Says what their name is
	 */
	void giveName() {
		System.out.println("My name is " + myName);
	}
	/*
	 * Tells them what their job is
	 */
	void whatDoYouDo() {
		System.out.println("I am a " + occupation);
	}
	
	abstract void askQuestion();
	
	abstract void answerQuestion();
}
