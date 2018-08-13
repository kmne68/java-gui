/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

// import javax.swing.AbstractAction.*;

import javax.swing.JFrame;


/**
 *
 * @author Keith
 */
public class GameBoard extends JFrame {
    
    public GameBoard() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setSize(800, 800);
        this.setTitle("Game GUI");
        this.setBounds(250, 250, 800, 800);
        
        GameGraphics gameGraphics = new GameGraphics();
        this.getContentPane().add(gameGraphics);
        
        this.setVisible(true);
    }
}
