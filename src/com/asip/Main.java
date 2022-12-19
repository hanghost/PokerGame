package com.asip;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Player player = new Player();
        player.playerHand = deck.dealHand();
        GameUI gameUI = new GameUI(deck, player);

    }

}
