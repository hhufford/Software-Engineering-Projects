/**
 * @author : Heidi Hufford and Evan Lim
 */

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * 
 * First GamePiece does not implement Moveable
 * InteractionResult used: None
 *
 */
public class First extends GamePiece {
	/**
	 * Game Piece Constructor
	 * 
	 * @param symbol   symbol for the game piece
	 * @param location holds initial location of game piece
	 */
	public First(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * The piece has this interaction result no matter the location of this piece and the player
	 * 
	 * When the player interacts with this piece, the interaction is NONE
	 * 
	 * @return InteractionResult.NONE
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		return InteractionResult.NONE;
	}

}
