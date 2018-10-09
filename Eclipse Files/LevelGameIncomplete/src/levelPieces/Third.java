package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


/**
 * 
 *Third GamePiece does not implement Moveable
 * InteractionResult used: Advance
 *
 */
public class Third extends GamePiece {

	/**
	 * Game Piece Constructor
	 * 
	 * @param symbol   symbol for the game piece
	 * @param location holds initial location of game piece
	 */
	public Third(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Game piece interacts when on the same square as the player
	 * 
	 * When the pieces interact, the player advances to the next level
	 * 
	 * @return InteractionResult.ADVANCE
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
	
		// TODO Auto-generated method stub
		
		if (playerLocation == getLocation()) {
			return InteractionResult.ADVANCE;
		}
		
		return null;
	}

}
