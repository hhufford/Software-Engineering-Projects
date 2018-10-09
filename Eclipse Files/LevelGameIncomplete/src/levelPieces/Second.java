/**
 * @author : Heidi Hufford and Evan Lim
 */

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


/**
 * 
 *Second GamePiece does not implement Moveable
 * InteractionResult used: Get Point
 *
 */
public class Second extends GamePiece {

	/**
	 * Game Piece Constructor
	 * 
	 * @param symbol   symbol for the game piece
	 * @param location holds initial location of game piece
	 */
	public Second(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Game piece interacts when on the same square as the player
	 * 
	 * When the pieces interact, the player gets a point
	 * 
	 * @return InteractionResult.GET_POINT
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		
		if (playerLocation == getLocation()) {
			return InteractionResult.GET_POINT;
		}
		// TODO Auto-generated method stub
		return null;
	}

}
