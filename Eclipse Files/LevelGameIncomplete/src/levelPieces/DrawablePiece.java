/**
 * @author : Heidi Hufford and Evan Lim
 */

package levelPieces;
import gameEngine.Drawable;

/**
 * 
 * drawablePiece class is the playing piece that only implements Drawable and doesn't extend GamePiece
 *
 */
public class DrawablePiece implements Drawable{
	private char symbol;
	private int location;

	
	/**
	 * drawablePiece constructor
	 * 
	 * @param symbol  holds the symbol for the Drawable playing piece
	 * @param location  holds the location of the Drawable playing piece
	 */
	public DrawablePiece(char symbol, int location) {
		super();
		this.symbol = symbol;
		this.location = location;
	}
	
	/**
	 * 
	 * @return instance variable holding the piece's location
	 */
	public int getLocation() {
		return location;
	}

	
	/**
	 * drawablePiece implementation of draw from the Drawable interface
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(symbol);
		
	}
	
}
