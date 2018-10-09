/**
 * @author Heidi Hufford and Evan Lim
 */

package levelPieces;

import java.util.ArrayList;
import java.util.Arrays;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;


/**
 * 
 * LevelEngine class is responsible for creating levels, and holding and returning the board array, lists of moving pieces and interacting pieces, and the starting position of the player
 *
 */
public class LevelEngine {
	
	private Drawable[] board = new Drawable[GameEngine.BOARD_SIZE];
	private ArrayList<Moveable> movingPieces = new ArrayList(2);
	private ArrayList<GamePiece> interactingPieces = new ArrayList(5);
	private int pStart;
	//-----------------------------------------------------
	
	/**
	 * LevelEngine Constructor
	 */
	public LevelEngine() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * levelOne method
	 * 
	 * Contains 5 pieces, one each of type DrawablePiece, Second, Third, Fourth, and Fifth
	 * 
	 * Fills board array, movingPieces ArrayList, interactingPieces ArrayList, and pStart variable
	 */
	private void levelOne()
	{
		
		//initialize game pieces
		DrawablePiece a = new DrawablePiece('a', 7);
		Second b = new Second('b', 4);
		Third c = new Third('c', 2);
		Fourth d = new Fourth('d', 15);
		Fith e = new Fith('e',19);
			
		//fill board
		board[a.getLocation()] = a;
		board[b.getLocation()] = b;
		board[c.getLocation()] = c;
		board[d.getLocation()] = d;
		board[e.getLocation()] = e;
		
		//board[1] = new DrawablePiece('a',7);
		
		//fill movingPieces ArrayList
		movingPieces.add(d);
		movingPieces.add(e);
		
		interactingPieces.add(b);
		interactingPieces.add(c);
		interactingPieces.add(d);
		interactingPieces.add(e);
		
		pStart = 10;
	}
	
	
	/**
	 * levelTwo method
	 * 
	 * Contains 6 pieces, one each of type DrawablePiece, First, Second, Third, Fourth, and Fifth
	 * 
	 * Fills board array, movingPieces ArrayList, interactingPieces ArrayList, and pStart variable
	 */
	private void levelTwo() {
		movingPieces.clear();
		interactingPieces.clear();
		Arrays.fill(board, null);
		
		
		DrawablePiece a = new DrawablePiece('a', 9);
		Second b = new Second('b', 18);
		Third c = new Third('c', 4);
		Fourth d = new Fourth('d', 20);
		Fith e = new Fith('e',1);
		First f = new First('f', 12);
		
			
		//fill board
		board[a.getLocation()] = a;
		board[b.getLocation()] = b;
		board[c.getLocation()] = c;
		board[d.getLocation()] = d;
		board[e.getLocation()] = e;
		board[f.getLocation()] = f;
		
		//fill movingPieces ArrayList
		movingPieces.add(d);
		movingPieces.add(e);
		
		interactingPieces.add(b);
		interactingPieces.add(c);
		interactingPieces.add(d);
		interactingPieces.add(e);
		interactingPieces.add(f);
		
		pStart = 10;
		
	}
	
	
	/**
	 * Calls the method for the appropriate level
	 * 
	 * @param levelNum  tells the LevelEngine whether to go to the first or second level
	 */
	public void createLevel(int levelNum) {
		
		if (levelNum == 1) {
			levelOne();
		}
		else {
			levelTwo();
		}
		
	}


	/**
	 * 
	 * @return board: drawable array representation of the board; characters in their places and null in all other places
	 */
	public Drawable[] getBoard()
		{
				return board;
		}
	
	
	/**
	 * 
	 * @return movingPieces: ArrayList of all pieces that can move
	 */
	public ArrayList<Moveable> getMovingPieces()
	{
		return movingPieces;
	}
	
	/**
	 * 
	 * @return interactingPieces: ArrayList of all pieces that interact
	 */
	public ArrayList<GamePiece> getInteractingPieces()
	{
		return interactingPieces;
	}
	
	
	/**
	 * 
	 * @return pStart: the location of the player at the start of the level
	 */
	public int getPlayerStartLoc()
	{
		return pStart;
	}
}
