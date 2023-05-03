/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameoflife;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.*;


/**
 *
 * @author zachroyer
 */
public class GUI extends JFrame{
    
    JFrame gui;

    public GUI() {
	    
	gui = new JFrame();
	setSize(1300, 700);
	setLayout(new GridLayout());
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	
	gui.add(new Game());
        
        
    }
    
    
    
}


class Game extends JPanel {
	
	public Game() {
		setSize(1300,700);
		setLayout(new GridLayout());
	}
	
	@Override
	public void paintComponent(Graphics g) {
		setBackground(Color.BLACK);
	}
	
}