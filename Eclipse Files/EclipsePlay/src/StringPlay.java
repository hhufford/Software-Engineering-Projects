import java.awt.Point;


public class StringPlay {
	
	public static void main(String[] args) {
		String firstString = "C++ is cool";
		String secondString = "I love Java";
		
		//combine the two above strings to say "Java is cool"
		String combinedStrings = secondString.substring(7,11) + firstString.substring(3,11);
		
		//print out the above string, "Java is cool"
		System.out.println(combinedStrings);
		
		
		
		//Use the Point class to show how == tests the address of an object, not its contents
		Point point1 = new Point(1,5);
		Point point2 = new Point(1,5);
		
		if (point1 == point2) {
			System.out.println("The two points are the same.");
		}
		else {
			System.out.println("Although the two points have identical contents, java says they are not equal because it's checking the location at which the points are stored rather than their contents.");
		}
		
		
		//compare equals() and equalsIgnoreCase()
		String lowerString = "this is a string";
		String upperString = "THIS IS A STRING";
		
		//test equals()
		if (lowerString.equals(upperString)) {
			System.out.println("Taking case into consideration, the two strings are equal.");
		}
		else {
			System.out.println("Taking case into consideration, the two strings are not equal.");
		}
		
		//test equalsIgnoreCase()
		if (lowerString.equalsIgnoreCase(upperString)) {
			System.out.println("Ignoring capitalization, the two strings are equal.");
		}
		else {
			System.out.println("Ignoring capitalization, the two strings are not equal.");
		}
		

	}
}
