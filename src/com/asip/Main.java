package com.asip;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Deck deck = new Deck();
       deck.shuffle();
        for(Card card : deck.cards){
            System.out.println(card.getCardName());
        }
    }
}
