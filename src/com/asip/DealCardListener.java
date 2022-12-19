package com.asip;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DealCardListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton dealCardButton = (JButton) e.getSource();
        GameUI gameUI = (GameUI) SwingUtilities.getRoot(dealCardButton);
        JPanel cardPanel = gameUI.getCardPanel();
        CardButton[] cardButtons = (CardButton[]) cardPanel.getComponents();
        for(CardButton cButton : cardButtons){
            if(cButton.isSelected()){
                //cButton.setCard(c);
            }
        }
        System.out.println("Dealing Card");
    }
}
