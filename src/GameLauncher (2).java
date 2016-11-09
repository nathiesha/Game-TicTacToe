/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yas
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;




public class GameLauncher {
	
	
	public static void main(String[] args) {
		
		// Game width and height
		Dimension gameDimension = new Dimension(400, 300);
		// Create a window
		JFrame frame = new JFrame();
		
		// Set internal panel size
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setPreferredSize( gameDimension );
		panel.setLayout(null);
		frame.setVisible(true);
		// Create our game 
		openWindow g = new openWindow();            
                g.setFrame(gameDimension, Color.GRAY );   
                //frame.add(g);
		frame=g;
		// Setting for the frame
		// Set default behavior to close on exit
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// Stop resizing
		frame.setResizable(false);		
		// Set title
		frame.setTitle("Tic Tac Toe");
		// Pack the content
		frame.pack();
		// Center the frame
		frame.setLocationRelativeTo(null);
		// Show the frame
		frame.setVisible(true);

		//Add listener
		//frame.addKeyListener((KeyListener) g);
		// Start the game
		//g.Start();

              		
	}
}
