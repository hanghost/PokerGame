package com.asip;

import javax.swing.*;
import java.awt.*;

public class CardButton extends JButton {
    private Card Card;

    public Card getCard(){
        return this.Card;
    }

    public void setCard(Card c){
        this.Card = c;
        ImageIcon icon = new ImageIcon(this.Card.getCardPath());
        this.setIcon(icon);
    }

    public CardButton(Card c){
        this.Card = c;
        ImageIcon icon = new ImageIcon(this.Card.getCardPath());
        ImageIcon backIcon = new ImageIcon(Card.backImagePath);
        this.setIcon(icon);
        this.setSelectedIcon(backIcon);
        this.addActionListener(new HoldCardListener());
        Dimension d = new Dimension();
        d.setSize(224,312);
        this.setPreferredSize(d);
    }

}
