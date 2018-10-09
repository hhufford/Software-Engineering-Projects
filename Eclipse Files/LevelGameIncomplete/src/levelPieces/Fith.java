/**
 * @author : Heidi Hufford and Evan Lim
 */

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import gameEngine.GameEngine;
import java.util.Random;

/**
 * 
 *Fifth GamePiece implements Moveable
 * InteractionResult used: HIT
 *
 */
public class Fith extends GamePiece implements Moveable{

	/**
	 * Game Piece Constructor
	 * 
	 * @param symbol   symbol for the game piece
	 * @param location holds initial location of game piece
	 */
	public Fith(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Game piece interacts at a distance when the player is two spots ahead of the game piece
	 * 
	 * When the pieces interact, the player takes a hit
	 * 
	 * @return InteractionResult.HIT
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		
		if (playerLocation == GameEngine.BOARD_SIZE-2 && getLocation() ==0 )
		{
			return InteractionResult.HIT;
		}
		else if (playerLocation == GameEngine.BOARD_SIZE -1 && getLocation() == 1)
		 {
			 return InteractionResult.HIT; 
		 }
		else if(playerLocation + 2 == getLocation())
		{
			return InteractionResult.HIT;
		}
	return null;
	}
	
	/**
	 * Changes the current location of Fifth game piece
	 * Updates gameBoard to reflect new configuration
	 * 
	 * Movement method: random
	 * 
	 * @param gameBoard  is the array of drawable objects and nulls that represent the current configuration of the board
	 * @param playerLocation  is the current location of the player
	 */

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		Random randVar = new Random();
		
		int num = randVar.nextInt(GameEngine.BOARD_SIZE-1) + 0;
		
		setLocation(num);
		
	}
	

}
