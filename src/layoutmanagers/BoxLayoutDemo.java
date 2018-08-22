/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutmanagers;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kmne6
 */
public class BoxLayoutDemo extends JFrame {
    
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    
    public BoxLayoutDemo() {
        
        JPanel display = new JPanel();
        display.setLayout(new BoxLayout(display, BoxLayout.LINE_AXIS));
        
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        
        display.add(btn1);
        display.add(btn2);
        display.add(btn3);
        display.add(btn4);
        display.add(btn5);
        
        // add the display to the frame
        add(display);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setSize(400, 400);
        this.setTitle("Box Layout");
        this.setBounds(250, 250, 400, 400);
        this.setVisible(true);
    }
    
}
