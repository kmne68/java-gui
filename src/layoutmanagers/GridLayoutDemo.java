/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutmanagers;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Keith
 */
public class GridLayoutDemo extends JFrame {
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    
    
    public GridLayoutDemo() {  
            
        JPanel display = new JPanel(new GridLayout(4, 2)); // four rows, two columns
        
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");        
        btn6 = new JButton("Button 6");
        btn7 = new JButton("Button 7");
        btn8 = new JButton("Button 8");
        
        display.add(btn1);
        display.add(btn2);
        display.add(btn3);
        display.add(btn4);
        display.add(btn5);
        display.add(btn6);
        display.add(btn7);
        display.add(btn8);
        
        
        
        add(display);
        
        // set everything to visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setSize(400, 400);
        this.setTitle("Grid Layout Demo");
        this.setBounds(250, 250, 400, 400);
        this.setVisible(true);
        
    }
    
}
