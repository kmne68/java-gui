/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutmanagers;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kmne6
 */
public class FlowLayoutDemo extends JFrame {
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    
    public FlowLayoutDemo() {
        
        JPanel display = new JPanel(new GridLayout(2, 1));
        
        // create buttons                
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");

        JPanel pnl1 = new JPanel(new FlowLayout());
        pnl1.add(btn1);
        pnl1.add(btn2);
        
        JPanel pnl2 = new JPanel();
        pnl2.add(btn3);
        pnl2.add(btn4);
        
        display.add(pnl1);
        display.add(pnl2);
        add(display);
        
        // set everything visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setSize(400, 400);
        this.setTitle("Flow Layout Demo");
        this.setBounds(250, 250, 400, 400);
        this.setVisible(true);
        
    }
}
