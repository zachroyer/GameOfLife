/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameoflife;

import java.awt.Point;

/**
 *
 * @author zachroyer
 */
public class Cell {

	final public Point position;
	public boolean alive;
	private int neighborCount;

	public Cell(int xPos, int yPos, boolean state) {

		alive = state;
		neighborCount = 0;
		position = new Point();

		position.setLocation(xPos, yPos);
		
	}

	public void changeState() {
			alive ^= alive;
		}

	
	
	public void setNeighborCount(int nCount) {
		this.neighborCount = nCount;
	}
	

}
