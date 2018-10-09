/**
 * @author : Heidi Hufford and Evan Lim
 */

package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/**
 * 
 *Fourth GamePiece implements Moveable
 * InteractionResult used: KILL
 *
 */

public class Fourth extends GamePiece implements Moveable {
	/**
	 * Game Piece Constructor
	 * 
	 * @param symbol   symbol for the game piece
	 * @param location holds initial location of game piece
	 */
	public Fourth(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Game piece interacts when on the same square as the player
	 * 
	 * When the pieces interact, the player dies and the game ends
	 * 
	 * @return InteractionResult.KILL
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		
	if( playerLocation == getLocation())
	{
		return InteractionResult.KILL;
	}
		return null;
	}

	/**
	 * Changes the current location of Fourth game piece
	 * Updates gameBoard to reflect new configuration
	 * 
	 * Movement method: Each time, the piece moves one to the right, and when it reaches the end, it moves to position 0
	 * 
	 * @param gameBoard  is the array of drawable objects and nulls that represent the current configuration of the board
	 * @param playerLocation  is the current location of the player
	 */
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if (getLocation() < GameEngine.BOARD_SIZE -1) {
			setLocation(getLocation()+1);
		}
		else {
			setLocation(0);
		}
		
		
	}
	

		

}
