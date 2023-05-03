/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameoflife;

/**
 *
 * @author zachroyer
 */
import java.util.Random;

public class gameLogic {

	private Cell[][] nextState;
	Cell[][] gameSpace = new Cell[25][25];

	public gameLogic() {

		/*
        Rules:
        FOR A POPULATED SPACE
        
            Each cell with ONE or NO neighbors dies
        
            Each cell with FOUR or more neighbors dies
        
            Each cell with TWO or THREE neighbors survives
        
        
        FOR AN UNPOPULATED SPACE
        
             Each cell with three neighbors becomes populated
        
		 */
	}

	//Overloaded constructor to specify if you want the gameSpace to display some cells for you
	public gameLogic(boolean preLoadedCells) {
		if (preLoadedCells = true) {

			Random state = new Random();

			//Randomly Populates the gameSpace
			for (int i = 0; i < 25; i++) {
				for (int c = 0; c < 25; c++) {
					getCell(i, c).changeState(state.nextInt(1));
				}
			}
		}
	}

	public Cell getCell(int x, int y) {
		return this.gameSpace[x][y];
	}

	//Method for checking if neighbors are populated
	private int neighborCount(Cell cell) {
		
	
		return 1;
//		int thisX = this.getCell(, 0)
//		switch () // if northwest neighbor exists
//		//if northwest neighbor is alive
//		//update neighbor count
//		
//		return 0;
	}

	/*
	*	Cycles Through Grid
	*	gets neighbor count of cell
	*	Updates Cell state based on neighbor 
	*	count through updateCell() method
	*/

	private void updateGameSpace(/*cell, int state returned from neighborCount()*/int state) {

		Cell[][] nextState = this.gameSpace;

		for (int i = 0; i < 25; i++) {
			for (int c = 0; c < 25; c++) {
				int currneighborCount = neighborCount(getCell(i, c));

			}
		}
	}

	//Takes a cell and the Cell's 
	private void updateCell(Cell cell, int nCount) {
		switch (nCount) {
			case 0:
			case 1:

				break;

			case 2:
			case 3:
				break;

			default:

				break;
		}
		/*
	TO-DO LIST:
    
    Method for updating gameSpace depending on game rules using return from neighborCount() method
	
	Method for updating one cell
    
    Getter method for 2d array to be able to fill with JComponents 
		 */
	}
