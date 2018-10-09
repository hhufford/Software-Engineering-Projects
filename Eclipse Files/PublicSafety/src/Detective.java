/**Purpose: Maintain information about each detective
 * @author - Heidi Hufford and Evan Lim
 */
public class Detective {
	private String name;
	private int badgeNum;
	
	
	/**
	 * Constructor, makes a detective object
	 * 
	 * @param name holds the detective's name (given by the user)
	 * @param badgeNum holds the detective's badge number (assigned by the station)
	 */	
	public Detective(String name, int badgeNum) {
		super();
		// TODO Auto-generated constructor stub
		this.name = name;
		this.badgeNum = badgeNum;
	}

	/**
	 * Defines the way detective information should be printed
	 */	
	@Override
	public String toString() {
		return "Detective [Badge=" + badgeNum + ", Name=" + name + "]";
	}
	
	
	
	

}
