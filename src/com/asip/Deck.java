package com.asip;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();

        for(CardNumber nr : CardNumber.values()){
            for(CardColor color : CardColor.values()){
                Card card = new Card();
                card.setNr(nr);
                card.setColor(color);
                this.cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public ArrayList<Card> dealHand() {
        //get 5 cards
        return null;
    }

    public ArrayList<Card> dealHand(int nrOfCards) {
        //get x cards
        return null;
    }
}
