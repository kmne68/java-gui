/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;

/**
 *
 * @author Keith
 */
public class GamePanel extends JPanel {
    
    public GamePanel() {
        
        JLabel field1 = new JLabel("Enter input 1:");
        JLabel field2 = new JLabel("Enter input 2:");
        
        JTextField textField1 = new JTextField(10);  // 10 char wide
        JTextField textField2 = new JTextField(10);
        
        JButton button1 = new JButton("Save Input");
        
        this.add(field1);
        this.add(textField1);
        this.add(field2);
        this.add(textField2);
        this.add(button1);
        
        this.setVisible(true);
    }
}
