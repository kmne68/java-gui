/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Keith
 */
public class GamePanel extends JPanel {

    private JLabel field1;
    private JLabel field2;
    private JLabel resultLabel;

    private JTextField textField1;  // 10 char wide
    private JTextField textField2;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    private final String field1LabelName = "Field one label";
    private final String field2LabelName = "Field two label";
    private final String field1NextName = "next";
    private final String field1FirstName = "first";
    private final String field1PreviousName = "previous";
    private final String field1LastName = "last";

    int clickCount1;
    int clickCount2;
    int clickCount;

    public GamePanel() {

        this.setSize(400, 400);

        field1 = new JLabel("Enter input 1:");
        field2 = new JLabel("Enter input 2:");

        textField1 = new JTextField(10); // 10 char wide
        textField2 = new JTextField(10);

        button1 = new JButton("Save input");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
           
            
        });
        
        button2 = new JButton(" << first ");
        button3 = new JButton(" < prev ");
        button4 = new JButton(" > next ");
        button5 = new JButton(" >> last ");       
        
        this.add(field1);

        this.add(textField1);

        this.add(field2);

        this.add(textField2);

        this.add(button1);
        
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        
        resultLabel = new JLabel();
        this.add(resultLabel);
        

        this.setVisible(true);
    }
}
