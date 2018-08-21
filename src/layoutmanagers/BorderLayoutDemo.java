/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutmanagers;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Keith
 */
public class BorderLayoutDemo extends JFrame {
    
    JButton btnNorth;
    JButton btnEast;
    JButton btnSouth;
    JButton btnWest;
    JButton btnCenter;
    
    public BorderLayoutDemo() {
    
        JPanel display = new JPanel(new BorderLayout());

        btnNorth = new JButton("NORTH");
        btnEast = new JButton("EAST");
        btnSouth = new JButton("SOUTH");
        btnWest = new JButton("WEST");
        btnCenter = new JButton("CENTER");
        
        // add controls to each section of the panel
        display.add(btnNorth, BorderLayout.NORTH);
        display.add(btnEast, BorderLayout.EAST);
        display.add(btnSouth, BorderLayout.SOUTH);
        display.add(btnWest, BorderLayout.WEST);
        display.add(btnCenter, BorderLayout.CENTER);
        
        
        // add display to the frame
        add(display);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setSize(800, 400);
        this.setTitle("Game");
        this.setBounds(250, 250, 400, 400);
        this.setVisible(true);
        
    }
}
