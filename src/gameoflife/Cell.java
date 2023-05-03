/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameoflife;

import java.awt.Point;
import javax.swing.JButton;

/**
 *
 * @author zachroyer
 */
public class Cell extends JButton {

	Point position;
	boolean alive;

	public Cell(int xPos, int yPos, boolean state) {

		alive = state;
		position = new Point();

		position.setLocation(xPos, yPos);
	}

	public void changeState(int change) {
		if (change == 1) {
			alive ^= alive;
		}

	}

}
