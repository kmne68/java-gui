/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutmanagers;

import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Keith
 */
public class CardLayoutDemo extends JFrame {
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    
    JComboBox cardChanger;
    final String card1 = "Top Buttons";
    final String card2 = "Secondary Buttons";
    public JPanel displayCards;
    
    
    public CardLayoutDemo() {
        
        JPanel pnl1 = new JPanel();     // any layout may be used here
        JPanel pnl2 = new JPanel();     // any layout may be used here
     
        // create buttons
                
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        
        // add buttons to card panel
        pnl1.add(btn1);
        pnl1.add(btn2);
        pnl2.add(btn3);
        pnl2.add(btn4);
        pnl2.add(btn5);
        
        // create cards panel container
        displayCards = new JPanel(new CardLayout());
        displayCards.add(pnl1, card1);
        displayCards.add(pnl2, card2);
        
        // create a combobox to change the cards at will
        String choices[] = { card1, card2 };
        cardChanger = new JComboBox(choices);
        cardChanger.setEditable(false);
        cardChanger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                
                CardLayout card1 = (CardLayout) (displayCards.getLayout());
                card1.show(displayCards, (String)e.getItem());
            }            
        });
        
        // display the combo box and the cards that can be changed
        JPanel display = new JPanel();
        display.add(cardChanger);
        display.add(displayCards);
        // add the display to the frame
        add(display);
        
        // set everything visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setSize(400, 400);
        this.setTitle("Card Panel Demo");
        this.setBounds(250, 250, 400, 400);
        this.setVisible(true);
    }
}
