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

	Cell[][] gameSpace = new Cell[25][25];
//	ArrayList<ArrayList<Cell>> gameSpace = new ArrayList<>(25);

	public gameLogic() {

	}

	//Overloaded constructor to specify if you want the gameSpace to display some cells for you
	public gameLogic(boolean preLoadedCells) {
		if (preLoadedCells = true) {

			Random state = new Random();

			//Randomly Populates the gameSpace
			for (int i = 0; i < 25; i++) {
				for (int c = 0; c < 25; c++) {
					if (state.nextInt() == 1) {
						getCell(i, c).changeState();
					}
				}
			}
		}
	}

	public Cell getCell(int x, int y) {
		return this.gameSpace[x][y];
	}

	//Method for checking if neighbors are populated
	private int neighborCount(Cell cell) {

		int aliveNeighbors = 0;
		int thisX = cell.position.x;
		int thisY = cell.position.y;

		for (int i = -1; i <= thisX + 2; i++) {
			for (int l = -1; l <= thisY + 2; l++) {

				if (i == 0 && l == 0) {
					continue;
				}

				int neighborX = thisX + i;
				int neighborY = thisY + l;

				//Check if neighbor position is within bounds og game space
				if (neighborX >= 0 && neighborX < gameSpace.length && neighborY >= 0 && neighborY < gameSpace[0].length) {
					Cell neighborCell = gameSpace[neighborX][neighborY];

					// Check if the neighbor cell is alive
					if (neighborCell.alive) {
						aliveNeighbors++;
					}
				}
			}
		}
		return aliveNeighbors;
	}

	/*
	*	Cycles Through Grid
	*	gets neighbor count of cell
	*	Updates Cell state based on neighbor 
	*	count through updateCell() method
	 */
	private void updateGameSpace() {

		Cell[][] nextState = this.gameSpace;

		//Loops through each cell in gameSpace
		for (int i = 0; i < 25; i++) {
			for (int c = 0; c < 25; c++) {

				//grabs cells current neighbors
				Cell currCell = getCell(i, c);
				int currNeighborCount = neighborCount(currCell);

				//Updates and adds cell to staged nextState game space
				nextState[i][c] = updateCell(currCell, currNeighborCount);

			}
		}

		//updates gameSpace with the cells that have been checked wiht game logic
		this.gameSpace = nextState;
	}

	//Takes a Cell and the Cell's neighbor count and applies game logic
	private Cell updateCell(Cell cell, int nCount) {

		/*
		* Rules:
		* FOR A POPULATED SPACE
        
		* Each cell with ONE or NO neighbors dies
		
		* Each cell with FOUR or more neighbors dies
        
		* Each cell with TWO or THREE neighbors survives
        
		* FOR AN UNPOPULATED SPACE
        
		* Each cell with three neighbors becomes populated
        
		 */
		if (cell.alive) {
			switch (nCount) {
				case 0, 1 ->
					cell.changeState();
				case 4 ->
					cell.changeState();
				default -> {
				}
			}

		} else if (nCount == 3) {
			cell.changeState();
		}
		
		return cell;
	}
}
/*
	TO-DO LIST:
        
    Getter method for 2d array to be able to fill with JComponents 
 */
