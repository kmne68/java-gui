/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import javax.swing.JComponent;

/**
 *
 * @author kmne6
 */
public class GameGraphics extends JComponent {
    
    public void paint(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        
        // draw an "X"
        g2.drawLine(10, 10, 40, 40);
        g2.drawLine(40, 10, 10, 40);
        
        // draw and "O"
        g2.setPaint(Color.YELLOW);
        g2.fillOval(50, 10, 70, 70);
        
        g2.setPaint(Color.BLACK);
        g2.fillOval(70, 20, 15,15);
        g2.fillOval(90, 20, 15, 15);
        
        g2.drawLine(88, 40, 88, 45);
        
        g2.setColor(Color.WHITE);
        g2.fillArc(70, 40, 30, 30, 200, 140);
        
        g2.setPaint(Color.BLACK);
        g2.drawArc(70, 40, 30, 30, 200, 140);
    }
}
