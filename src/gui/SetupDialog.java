/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author kmne6
 */
public class SetupDialog {
    
    // player inputs
    private String playerName = JOptionPane.showInputDialog("What is your name?");
    private int seed = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number of signicance to you."));
    
    // output
    private String output = String.format("Welcome %s.\nYour seed is %d. Tend it carefully.\nBe prepared...", playerName, seed);
    
    

    
    public SetupDialog() {

    JOptionPane.showMessageDialog (null, output, "Test", JOptionPane.INFORMATION_MESSAGE);
    
}    
}
