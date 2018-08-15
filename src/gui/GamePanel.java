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

    private JLabel lblField1;
    private JLabel lblField2;
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
    final String btnNextName = "next";
    final String btnFirstName = "first";
    final String btnPreviousName = "previous";
    final String btnLastName = "last";

    int clickCount1;
    int clickCount2;
    int clickCount;

    public GamePanel() {

        this.setSize(400, 400);

        
        lblField1 = new JLabel("Enter input 1:");
        lblField1.setName(field1LabelName);
        
        lblField2 = new JLabel("Enter input 2:");
        lblField2.setName(field2LabelName);

        textField1 = new JTextField(10); // 10 char wide
        textField2 = new JTextField(10);

        button1 = new JButton("Save input");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                boolean enabled = false;
                String message = "";
                
                switch(clickCount % 2)
                {
                    case 0:
                        message = "All set";
                        enabled = false;
                        button1.setText("Unlock");
                        break;
                    case 1:
                        message = "Unlocked";
                        enabled = true;
                        button1.setText("Save input");
                        break;
                    default:
                        break;
                }
                
                textField1.setEnabled(enabled);
                textField2.setEnabled(enabled);
                
                JOptionPane.showMessageDialog(null, message, "Fields", JOptionPane.INFORMATION_MESSAGE);
                clickCount++;
            }
           
            
        });
        
        ActionListener navButtonEvent = new NavigationButtonPressEvent();
        button2 = new JButton(" << first ");
        button2.setName(btnFirstName);
        button2.addActionListener(navButtonEvent);
        
        button3 = new JButton(" < prev ");
        button3.setName(btnPreviousName);
        button3.addActionListener(navButtonEvent);
        
        button4 = new JButton(" > next ");
        button4.setName(btnNextName);
        button4.addActionListener(navButtonEvent);
        
        button5 = new JButton(" >> last "); 
        button5.setName(btnLastName);
        button5.addActionListener(navButtonEvent);
        
        this.add(lblField1);

        this.add(textField1);

        this.add(lblField2);

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
    
    
    class NavigationButtonPressEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            Object objectSource = e.getSource();
            if(objectSource instanceof JButton) {
                
                JButton button = (JButton) objectSource;
                String buttonName = button.getName();
                String message = "";
                
                if(buttonName.equals(btnFirstName)) {
                    message = "Button First pressed.";
                    System.out.println(buttonName);
                    
                }
                else if(buttonName.equals(btnLastName)) {
                    message = "Button Last pressed.";
                    System.out.println(buttonName);
                    
                }
                else if(buttonName.equals(btnPreviousName)) {
                    message = "Button Previous pressed.";
                    System.out.println(buttonName);
                    
                } 
                else if(buttonName.equals(btnNextName)) {
                    message = "Button Next pressed.";
                    System.out.println(buttonName);
                }
                resultLabel.setText(message);
            }
            
        }
    
}
}
