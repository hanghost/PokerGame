package com.asip;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameUI extends JFrame  {

    private JPanel CardPanel;
    public Deck Deck;
    public Player Player;

    public JPanel getCardPanel(){
        return this.CardPanel;
    }

    public GameUI(Deck d, Player p ){
        this.Deck = d;
        this.Player = p;
        this.setTitle("Poker Game");
        this.setSize(1500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
        createCardsPanel();
        createInfoPanel();

        showCards(this.Player.playerHand);

    }

    private void createInfoPanel() {
        FlowLayout flowLayout = new FlowLayout();
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(flowLayout);
        JButton dealButton = new JButton("Deal");
        dealButton.addActionListener(new DealCardListener());
        infoPanel.add(dealButton);
        this.add(infoPanel, BorderLayout.SOUTH);
    }

    public void createCardsPanel(){
        FlowLayout flowLayout = new FlowLayout();
        this.CardPanel = new JPanel();
        this.CardPanel.setLayout(flowLayout);
        this.add(CardPanel, BorderLayout.CENTER);
    }

    public void showCards(ArrayList<Card> cards){
        for(Card card : cards){
            CardButton cardButton = new CardButton(card);
            this.CardPanel.add(cardButton);
        }

        this.invalidate();
        this.validate();
        this.repaint();
    }

}
