/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutmanagers;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kmne6
 */
public class GridBagLayoutDemo {

    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JButton button;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints top = new GridBagConstraints();
        GridBagConstraints gamePanel = new GridBagConstraints();

     //   JPanel nextPiece = new JPanel();

        if (shouldFill) {
            top.fill = GridBagConstraints.HORIZONTAL;
        }

        JPanel score = new JPanel();
        score.setPreferredSize(new Dimension(200, 125));
        score.setBorder(BorderFactory.createBevelBorder(0, Color.lightGray, Color.yellow));
        if (shouldWeightX) {
            top.weightx = 0.5;
        }
        top.fill = GridBagConstraints.HORIZONTAL;
        top.gridx = 0;
        top.gridy = 0;
        pane.add(score, top);

        JPanel graphics = new JPanel();
        graphics.setPreferredSize(new Dimension(200, 125));
        graphics.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.green));
        if (shouldWeightX) {
            top.weightx = 0.5;
        }
        top.fill = GridBagConstraints.HORIZONTAL;
        top.gridx = 1;
        top.gridy = 0;
        pane.add(graphics, top);
        
        JPanel game = new JPanel();
        game.setPreferredSize(new Dimension(400, 600));
        game.setBorder(BorderFactory.createBevelBorder(0, Color.ORANGE, Color.RED));
        if (shouldFill) {
            //natural height, maximum width
            gamePanel.fill = GridBagConstraints.HORIZONTAL;
        }
        gamePanel.fill = GridBagConstraints.HORIZONTAL;
        gamePanel.weightx = 0.0;
        gamePanel.gridwidth = 3;
        gamePanel.gridx = 0;
        gamePanel.gridy = 1;
        pane.add(game, gamePanel);
        
        
        
//        button = new JButton("Long-Named Button 4");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.ipady = 40;      //make this component tall
//        c.weightx = 0.0;
//        c.gridwidth = 3;
//        c.gridx = 0;
//        c.gridy = 1;
//        pane.add(button, c);

        button = new JButton("5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10, 0, 0, 0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        pane.add(button, c);
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
